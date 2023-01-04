package com.emglab.qlsv.modules.searchMotel.fragments

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentRegisterToFindMotelBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.models.res.GetPlaceNameAutoByMapRes
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import com.emglab.qlsv.modules.searchMotel.viewModels.RegisterToFindMotelViewModel
import com.emglab.qlsv.utilities.API_MAP
import com.emglab.qlsv.webservices.WebService
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import kotlinx.android.synthetic.main.fragment_register_to_find_motel.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

@SuppressLint("SetTextI18n")
class RegisterToFindMotelFragment : Fragment(), Injectable {

    companion object {
        var selectedLocation: LatLng? = null
        var address: String = ""
    }

    private lateinit var viewModel: RegisterToFindMotelViewModel

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: FragmentRegisterToFindMotelBinding
    private var types: List<String> = listOf()
    private var userRequests: List<String> = listOf()
    val remoteConfig = Firebase.remoteConfig

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        getRemoteConfigValue()
        setupViewMotel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_register_to_find_motel,
            container,
            false
        )

        setupSelectedType()
        setupSelectedUserRequests()
        fillLocation()
        setupTextWatcher()

        binding.apply {
            locationLayout2.setEndIconOnClickListener {
                locationLayout2.isErrorEnabled = false
                if (checkLocationPermission()) {
                    navigateToPickLocation()
                }
            }

            locationLayout2.setErrorIconOnClickListener {
                locationLayout2.isErrorEnabled = false
                if (checkLocationPermission()) {
                    navigateToPickLocation()
                }
            }

            typeTil.setEndIconOnClickListener {
                showTypePickerDialog()
            }

            typeTil.setErrorIconOnClickListener {
                showTypePickerDialog()
            }

            priceSlider.setLabelFormatter {
                return@setLabelFormatter it.toDouble().toCurrency()
            }

            priceSlider.addOnChangeListener { slider, _, _ ->
                viewModel.setPrice(slider.values[0].toInt(), slider.values[1].toInt())
            }

            startDateLayout.setEndIconOnClickListener {
                showStartDatePicker()
            }

            startDateLayout.setErrorIconOnClickListener {
                showStartDatePicker()
            }

            endDateLayout.setEndIconOnClickListener {
                showEndDatePicker()
            }

            endDateLayout.setErrorIconOnClickListener {
                showEndDatePicker()
            }

            saveButton.setOnClickListener {
                handleSaveButtonTap()
            }
        }

        subscribeUI()
        return binding.root
    }

    private fun setupViewMotel() {
        viewModel = ViewModelProvider(this, factory).get(RegisterToFindMotelViewModel::class.java)
    }

    private fun getRemoteConfigValue(){
        val motelTypeStr = remoteConfig.getString("motel_types")
        types = motelTypeStr.split("|")
        val userRequestsStr = remoteConfig.getString("motel_user_requests")
        userRequests = userRequestsStr.split("|")
    }

    private fun subscribeUI() {
        with(viewModel) {
            price.observe(viewLifecycleOwner) {
                priceLabel.text = "${it.min.toCurrency()} - ${it.max.toCurrency()}"
            }

            startDate.observe(viewLifecycleOwner) {
                it?.let { date ->
                    binding.startDateLayout.isErrorEnabled = false
                    binding.startDateLayout.editText?.setText(date.getDateStr())
                }
            }

            endDate.observe(viewLifecycleOwner) {
                it?.let { date ->
                    binding.endDateLayout.isErrorEnabled = false
                    binding.endDateLayout.editText?.setText(date.getDateStr())
                }
            }

            selectedTypes.observe(viewLifecycleOwner) {
                fillSelectedType(it)
            }

            selectedRequests.observe(viewLifecycleOwner) {
                it.forEachIndexed { index, b ->
                    val checkBox = CheckBox(requireContext())
                    val value = userRequests[index]
                    checkBox.text = value
                    checkBox.id = index
                    checkBox.isChecked = b
                    requestsLayout.addView(checkBox)
                    checkBox.setOnCheckedChangeListener { _, _ ->
                        selectRequest(index)
                    }
                }
            }

            radius.observe(viewLifecycleOwner) {
                it?.let {
                    radiusText.setText(it.toString())
                }
            }

            numberOfPeople.observe(viewLifecycleOwner) {
                it?.let {
                    numberPeopleText.setText(it.toString())
                }
            }

            otherRequest.observe(viewLifecycleOwner) {
                otherRequestText.setText(it)
            }

            liveWithOther.observe(viewLifecycleOwner) {
                it?.let {
                    liveWithOtherCheckbox.isChecked = it
                }
            }
        }
    }

    private fun setupSelectedType() {
        if (viewModel.selectedTypes.value.isNullOrEmpty()) {
            viewModel.setSelectedTypes(
                ArrayList(types.map { false })
            )
        }
    }

    private fun fillSelectedType(values: ArrayList<Boolean>) {
        var typeStr = ""
        values.forEachIndexed { index, b ->
            if (b) {
                typeStr += "${types[index]}, "
            }
        }
        typeStr.drop(2)
        if (typeStr.isNotEmpty()) {
            binding.typeTil.isErrorEnabled = false
        }
        binding.typeTil.editText?.setText(typeStr)
    }

    private fun showTypePickerDialog() {
        val dialogBuilder = MaterialAlertDialogBuilder(requireContext())
        val selectedTypes = viewModel.selectedTypes.value!!
        dialogBuilder.setTitle("Chọn loại nhà trọ")
        dialogBuilder.setMultiChoiceItems(
            types.toTypedArray(), selectedTypes.toBooleanArray()
        ) { _, which, _ ->
            viewModel.selectType(index = which)
        }

        dialogBuilder.setCancelable(false)

        dialogBuilder.setPositiveButton("Đóng") { _, _ ->

            dialogBuilder.setCancelable(true)
        }
        dialogBuilder.show()
    }

    // ---
    private fun setupSelectedUserRequests() {
        if (viewModel.selectedRequests.value.isNullOrEmpty()) {
            viewModel.setRequests(
                ArrayList(userRequests.map { false })
            )
        }
    }

    // --- Date
    private fun showStartDatePicker() {
        val cal = Calendar.getInstance()
        viewModel.startDate.value?.let {
            cal.time = it
        }
        val currentYear = cal.get(Calendar.YEAR)
        val currentMonth = cal.get(Calendar.MONTH)
        val currentDay = cal.get(Calendar.DAY_OF_MONTH)
        val datePicker = DatePickerDialog(requireContext(), { _, year, month, day ->
            viewModel.setStartDate(day, month, year)
        }, currentYear, currentMonth, currentDay)
        datePicker.setTitle("Chọn ngày bắt đầu")
        datePicker.show()
    }

    private fun showEndDatePicker() {
        val cal = Calendar.getInstance()
        viewModel.endDate.value?.let {
            cal.time = it
        }
        val currentYear = cal.get(Calendar.YEAR)
        val currentMonth = cal.get(Calendar.MONTH)
        val currentDay = cal.get(Calendar.DAY_OF_MONTH)
        val datePicker = DatePickerDialog(requireContext(), { _, year, month, day ->
            viewModel.setEndDate(day, month, year)
        }, currentYear, currentMonth, currentDay)
        datePicker.setTitle("Chọn ngày kết thúc")
        datePicker.show()
    }

    // --- Location ---
    private fun navigateToPickLocation() {
        saveInfo()
        val action =
            RegisterToFindMotelFragmentDirections.actionRegisterToFindMotelFragmentToPickMotelLocationFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun fillLocation() {
        selectedLocation?.let {
            binding.locationName = if (address != "") address else it.getLocationStr()
            autoGetPlaceName(it.longitude, it.latitude)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun autoGetPlaceName(long: Double, lat: Double) {
        val retrofit =
            Retrofit.Builder().baseUrl(API_MAP).addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(WebService::class.java)
        val request = service.getPlaceNameAuto(long, lat)
        request.enqueue(object : Callback<GetPlaceNameAutoByMapRes> {
            override fun onResponse(
                call: Call<GetPlaceNameAutoByMapRes>,
                response: Response<GetPlaceNameAutoByMapRes>
            ) {
                val getPlaceResponse = response.body()
                if (getPlaceResponse != null) {
                    if (
                        (getPlaceResponse.data.districtName != null) and
                        (getPlaceResponse.data.wardName != null)
                    ) {
                        binding.address =
                            "${getPlaceResponse.data.districtName}, ${getPlaceResponse.data.cityName}"
                    } else {
                        binding.address = ""
                    }
                }
            }

            override fun onFailure(call: Call<GetPlaceNameAutoByMapRes>, t: Throwable) {
                Log.d("_MAPPLACENAME", "ERROR MAP ${t.message}")
            }
        })
    }

    private fun saveInfo() {
        with(viewModel) {
            val otherRequest = binding.otherRequestText.text.toString()
            val radius = binding.radiusText.text.toString().toIntOrNull()
            val numberPeople = binding.numberPeopleText.text.toString().toIntOrNull()
            saveInfo(radius, numberPeople, otherRequest, binding.liveWithOtherCheckbox.isChecked)
        }
    }

    private fun handleSaveButtonTap() {

        val location = selectedLocation
        val radius = binding.radiusText.text.toString().toIntOrNull()
        val types = typeTil.editText?.text
        val numberOfPeople = binding.numberPeopleText.text.toString().toIntOrNull()
        val startDate = viewModel.startDate.value
        val endDate = viewModel.endDate.value

        if (location != null && (radius != null && radius > 0) && !types.isNullOrEmpty() && numberOfPeople != null && startDate != null && endDate != null) {
            val motelRegistration = MotelRegistration()
            motelRegistration.lat = location.latitude
            motelRegistration.lng = location.longitude
            motelRegistration.locationName = binding.locationText.text.toString()
            motelRegistration.range = radius
            motelRegistration.address = binding.addressText.text.toString()
            motelRegistration.type = types.toString()
            motelRegistration.numberOfPeople = numberOfPeople
            motelRegistration.startDate = startDate.getTimeQuery()
            motelRegistration.endDate = endDate.getTimeQuery()

            var userRequestStr = ""
            viewModel.selectedRequests.value?.forEachIndexed { index, b ->
                if (b) userRequestStr += "${userRequests[index]}, "
            }
            userRequestStr += "${otherRequestText.text}, "
            userRequestStr.dropLast(2)

            motelRegistration.userRequests = userRequestStr
            motelRegistration.liveWithOther = if (binding.liveWithOtherCheckbox.isChecked) 1 else 0
            motelRegistration.minPrice = binding.priceSlider.values[0].toInt()
            motelRegistration.maxPrice = binding.priceSlider.values[1].toInt()

            saveMotelRegistration(motelRegistration)
            return
        }

        showToast("Thiếu thông tin")

        if (location == null) {
            binding.locationLayout2.error = "Bạn cần chọn vị trí tìm trọ"
        }

        if (radius == null || radius <= 0) {
            binding.radiusLayout.error = "Bạn hãy điền bán kính cần tìm trọ nhé"
        }

        if (types.isNullOrEmpty()) {
            binding.typeTil.error = "Bạn hãy chọn loại nhà trọ nhé"
        }

        if (numberOfPeople == null) {
            binding.numberOfPeopleLayout.error = "Bạn hãy điền số người ở cùng bạn nhé"
        }

        if (startDate == null) {
            binding.startDateLayout.error = "Thiếu thông tin"
        }

        if (endDate == null) {
            binding.endDateLayout.error = "Thiếu thông tin"
        }
    }

    private fun saveMotelRegistration(motelRegistration: MotelRegistration) {
        viewModel.apply {
            saveMotelRegistration(motelRegistration)
            saveMotelRegistrationResp.observe(viewLifecycleOwner) {
                binding.status = it.status
                if (it.status != Status.LOADING) {
                    saveMotelRegistrationResp.removeObservers(this@RegisterToFindMotelFragment)
                }
                if (checkResource(it)) {
                    popToMotelRegistrationList()
                }
            }
        }
    }

    private fun popToMotelRegistrationList() {
        showToast("Đăng kí thành công")
        MotelRegistrationListFragment.reloadData = true
        Navigation.findNavController(requireView()).navigateUp()
    }

    // --- Text Watcher ---
    private fun setupTextWatcher() {
        binding.apply {
            radiusLayout.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    radiusLayout.isErrorEnabled = false
                }

                override fun afterTextChanged(p0: Editable?) {}
            })

            numberOfPeopleLayout.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    numberOfPeopleLayout.isErrorEnabled = false
                }

                override fun afterTextChanged(p0: Editable?) {}
            })
        }
    }

}