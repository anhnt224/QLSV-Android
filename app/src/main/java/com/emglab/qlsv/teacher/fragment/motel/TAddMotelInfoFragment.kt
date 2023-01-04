package com.emglab.qlsv.teacher.fragment.motel

import android.content.DialogInterface
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.FragmentAddMotelInfo2Binding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showDialogMotel
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.teacher.viewmodel.motel.TAddMotelInfoViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import kotlinx.android.synthetic.main.fragment_add_motel_info.*
import javax.inject.Inject

class TAddMotelInfoFragment : Fragment(), Injectable {

    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: TAddMotelInfoViewModel
    private lateinit var binding: FragmentAddMotelInfo2Binding
    private var mAddress = UserAddress()
    private var motelInfo = Motel()
    private val remoteConfig = Firebase.remoteConfig
    private var typeMotel: List<String> = listOf()
    private var addMotel = false
    private var types: List<String> = listOf("KTX Bách Khoa", "KTX Pháp Vân", "Nhà trọ", "Nhà riêng")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = FragmentAddMotelInfo2Binding.inflate(inflater, container, false)
        mAddress = TAddNewAddressFragment.mAddress
        typeMotel = remoteConfig.getString("type_motel").split(",")

        binding.apply {
            buttonSave.setOnClickListener {
                saveAddress()
            }
            if (mAddress.type == types[0] ||  mAddress.type == types[1]){
                motelTypeTxt.setText(mAddress.type)
            }
            motelAddressTxt.setText(mAddress.address)
            binding.motelTypeLayout.editText?.setOnClickListener {
                if (mAddress.type == types[2]){
                    showAlertPickType()
                }
            }

            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                    if (i<20){
                        seekBar.thumb = AppCompatResources.getDrawable(requireContext(),R.drawable.thumb_one)
                    }
                    if ((i >= 20) && (i < 40) ){
                        seekBar.thumb = AppCompatResources.getDrawable(requireContext(),R.drawable.thumb_two)
                    }
                    if ((i >= 40) && (i < 60) ){
                        seekBar.thumb = AppCompatResources.getDrawable(requireContext(),R.drawable.thumb_three)
                    }
                    if ((i >= 60) && (i < 80) ){
                        seekBar.thumb = AppCompatResources.getDrawable(requireContext(),R.drawable.thumb_four)
                    }
                    if (i >= 80){
                        seekBar.thumb = AppCompatResources.getDrawable(requireContext(), R.drawable.thumb_five)
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {

                }

                override fun onStopTrackingTouch(seekBar: SeekBar) {

                }
            })

        }

        subscribeUI()
        return binding.root
    }

    private fun showAlertPickType(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn loại nhà trọ")
            .setItems(typeMotel.toTypedArray()){ _: DialogInterface?, which: Int ->
                motelTypeLayout.editText?.setText(typeMotel[which])
            }
            .setNegativeButton("Hủy"){_, _ ->
            }.show()
    }

    private fun saveAddress(){
        addMotel = true
        motelInfo.managerName = binding.hostNameTxt.text.toString()
        motelInfo.managerContact = binding.hostPhoneTxt.text.toString()
        motelInfo.description = binding.motelDescriptionTxt.text.toString()
        motelInfo.type = binding.motelTypeTxt.text.toString()
        motelInfo.address = binding.motelAddressTxt.text.toString()
        motelInfo.comment = binding.motelCommentTxt.text.toString()
        motelInfo.rate = binding.seekBar.progress
        if (motelInfo.managerName.isEmpty() || motelInfo.managerContact.isEmpty() || motelInfo.description.isEmpty()){
            showToast("Vui lòng nhập đầy đủ thông tin")
            return
        }
        if (motelInfo.managerContact.length != 10){
            showToast("Số điện thoại chưa chính xác")
            return
        }
        viewModel.updateUserAddress(mAddress, motelInfo)
    }

    private fun subscribeUI(){
        with(viewModel){
            updateUserAddress.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && addMotel){
                    if (it.data != null ){
                        Log.d("_ADDRESS", "${it.data}")
                        if ( it.data.motelID != null && it.data.motelID != 0){
                            addMotel = false
                            if (mAddress.type == types[0] || mAddress.type == types[1]){
                                showDialogMotel("Thêm ảnh chụp KTX",
                                    "Để có đánh giá khách quan hơn về thông tin ktx bạn cung cấp, iCTSV cần thêm ảnh chụp ktx này. Bạn có sẵn sàng thêm ảnh ktx?",
                                    R.drawable.ic_add_image_motel,
                                    "Thêm ảnh",
                                    {navigateToImageFragment(it.data.motelID!!)},
                                    "Bỏ qua",
                                    {   showToast("Thêm địa chỉ thành công")
                                        navigateListAddressFragment()}
                                )
                            }else{
                                addMotel = false
                                showDialogMotel("Thêm ảnh chụp nhà trọ",
                                    "Để có đánh giá khách quan hơn về thông tin nhà trọ bạn cung cấp, iCTSV cần thêm ảnh chụp nhà trọ này. Bạn có sẵn sàng thêm ảnh phòng trọ?",
                                    R.drawable.ic_add_image_motel,
                                    "Thêm ảnh",
                                    {navigateToImageFragment(it.data.motelID!!)},
                                    "Bỏ qua",
                                    {   showToast("Thêm địa chỉ thành công")
                                        navigateListAddressFragment()}
                                )
                            }
                        }else{
                            addMotel = false
                            showToast("Thêm thông tin chưa thành công")
                        }
                    }
                }
            }
        }
    }

    private fun navigateListAddressFragment(){
        Navigation.findNavController(requireView())
            .navigate(TAddMotelInfoFragmentDirections.actionTAddMotelInfoFragmentToTListAddressFragment())
    }
    private fun navigateToImageFragment(motelID: Int){
        Navigation.findNavController(requireView())
            .navigate(TAddMotelInfoFragmentDirections.actionTAddMotelInfoFragmentToTImageMotelFragment(motelID))
    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TAddMotelInfoViewModel::class.java)
    }

}