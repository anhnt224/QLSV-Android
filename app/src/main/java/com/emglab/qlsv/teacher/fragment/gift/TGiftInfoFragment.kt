package com.emglab.qlsv.teacher.fragment.gift

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TGiftInfoFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showActionDialog
import com.emglab.qlsv.extension.showNotificationDialog
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.ImageMotel2
import com.emglab.qlsv.models.entity.NotificationDialogType
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftInfoViewModel
import com.emglab.qlsv.ui.adapter.ImageGiftAdapter
import com.emglab.qlsv.ui.fragments.gift.GiftInfoFragmentArgs
import com.emglab.qlsv.utilities.API_UPLOAD_SERVICE_BASE_URL
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
import javax.inject.Inject


class TGiftInfoFragment : Fragment(), Injectable, ImageGiftAdapter.OnItemClickListener {
    private lateinit var viewModel: TGiftInfoViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: TGiftInfoFragmentBinding
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var gift: Gift
    private lateinit var giftImageAdapter: ImageGiftAdapter
    private val snapHelper: SnapHelper = LinearSnapHelper()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.t_gift_info_fragment,
            container,
            false
        )
        gift = GiftInfoFragmentArgs.fromBundle(requireArguments()).gift
        fillInfo(gift)
        binding.apply {
            registerButton.setOnClickListener {
                navigateToRegisterGift(this@TGiftInfoFragment.gift)
            }
            unRegisterButton.setOnClickListener {
                showActionDialog(
                    title = "X??c nh???n hu??? ????ng k??",
                    icon = R.drawable.ic_close,
                    message = "B???n c?? ch???c ch???n hu??? ????ng k?? nh???n ph???n qu?? n??y?",
                    positiveButtonTitle = "Hu???",
                    handlePositiveButtonTap = {
                        unRegisterGift()
                    },
                    negativeButtonTitle = "B??? qua"
                )

            }


        }

        return binding.root
    }


    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TGiftInfoViewModel::class.java)
    }

    private fun navigateToRegisterGift(gift: Gift){
        val action = TGiftInfoFragmentDirections.actionTGiftInfoFragmentToTApplyGiftFragment(gift)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun fillInfo(gift: Gift){
        binding.gift = gift
        val imageUrls = listOf(
            ImageMotel2("${API_UPLOAD_SERVICE_BASE_URL}ATMGift/DownloadImageGift?" +
                    "UserName=${sharedPrefsHelper.getUserName()}&" +
                    "TokenCode=${sharedPrefsHelper.getToken()}&" +
                    "GiftID=${gift.id}&TypeImage=1", 1),
            ImageMotel2("${API_UPLOAD_SERVICE_BASE_URL}ATMGift/DownloadImageGift?" +
                    "UserName=${sharedPrefsHelper.getUserName()}&" +
                    "TokenCode=${sharedPrefsHelper.getToken()}&" +
                    "GiftID=${gift.id}&TypeImage=2", 2),
            ImageMotel2("${API_UPLOAD_SERVICE_BASE_URL}ATMGift/DownloadImageGift?" +
                    "UserName=${sharedPrefsHelper.getUserName()}&" +
                    "TokenCode=${sharedPrefsHelper.getToken()}&" +
                    "GiftID=${gift.id}&TypeImage=3", 3)
        )

        giftImageAdapter = ImageGiftAdapter(imageUrls, requireActivity(), this)
        binding.banner.apply {
            adapter = giftImageAdapter
            layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.HORIZONTAL,
                false)
        }
        snapHelper.attachToRecyclerView(binding.banner)

        binding.apply {
            statusText.setBackgroundColor(
                ContextCompat.getColor(root.context, gift.getUStatus2().bgColor)
            )
            statusText.setTextColor(
                ContextCompat.getColor(root.context, gift.getUStatus2().titleColor)
            )
            tvQuan.text = gift.quantity.toString()
            tvQuanRegister.text = gift.registeredQuantity.toString()
        }
    }

    private fun unRegisterGift(){
        viewModel.cancelApplyGift(gift.id)
        with(viewModel){
            cancelApplyGift.observe(viewLifecycleOwner){
                binding.cancelApplyStatus = it.status
                if (checkResource(it)){
                    showNotificationDialog(
                        message = "Hu??? ????ng k?? qu?? t???ng th??nh c??ng",
                        cancelable = false,
                        type = NotificationDialogType.COMPLETE,
                        handleDone = {
                            navigateToGiftFragment()
                        }
                    )
                }
                if (!it.isLoading()){
                    cancelApplyGift.removeObservers(viewLifecycleOwner)
                }
            }
        }
    }

    private fun navigateToGiftFragment(){
        val action = TGiftInfoFragmentDirections.actionTGiftInfoFragmentToTGiftReceivedFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }
    private fun seePictureZoom(image: ImageMotel2){
        binding.imageLayoutZoom.visibility = View.VISIBLE
        val shimmer = Shimmer.AlphaHighlightBuilder()
            .setDuration(1800)
            .setBaseAlpha(0.7f) //the alpha of the underlying children
            .setHighlightAlpha(0.6f) // the shimmer alpha amount
            .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
            .setAutoStart(true)
            .build()
        val shimmerDrawable = ShimmerDrawable().apply {
            setShimmer(shimmer)
        }
        val url = image.urlImage
        Log.d("_IMAGE", "ok ${url}")
        Glide.with(requireActivity())
            .load(url)
            .placeholder(shimmerDrawable)
            .error(R.drawable.ic_gift_default)
            .into(binding.imageViewZoom)

        binding.closeButton.setOnClickListener {
            binding.imageLayoutZoom.visibility = View.GONE
        }
    }


    override fun onClickImageGift(imageGift: ImageMotel2) {
        seePictureZoom(imageGift)
    }
}