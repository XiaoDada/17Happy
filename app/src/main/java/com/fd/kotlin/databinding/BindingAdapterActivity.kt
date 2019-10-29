package com.fd.kotlin.databinding

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.fd.kotlin.databinding.bean.Image
import com.fd.kotlin.R

/**
 * @author   fengda
 * @time     2019/10/29 15:57
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class BindingAdapterActivity : AppCompatActivity() {
    lateinit var mBingContentView: BindingAdapterLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBingContentView =
            DataBindingUtil.setContentView<BindingAdapterLayoutBinding>(this, R.layout.binding_adapter_layout)
        mBingContentView.image =
            Image("http://03imgmini.eastday.com/mobile/20191028/20191028164000_bb9297b07d79bb6398f6a7b038f6e8ba_2_mwpm_03200403.jpg")
        mBingContentView.handlerClick = HandlerClick()
    }

    companion object {

        @BindingAdapter("url")
        fun loadImage(view: ImageView, url: String) {
            Glide.with(view.getContext()).load(url).into(view)
        }

    }


}