package com.fd.kotlin.Databinding.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fd.kotlin.R
import com.fd.kotlin.databinding.DatabindingFragViewBinding

/**
 * @author   fengda
 * @time     2019/10/28 16:08
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class DatabindingFragment : Fragment() {
    lateinit var databindingFragViewBinding: DatabindingFragViewBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         databindingFragViewBinding = DataBindingUtil.inflate<DatabindingFragViewBinding>(
            inflater,
            R.layout.databinding_frag_view,
            container,
            false
        )
        databindingFragViewBinding.hint="你好中国"
        return databindingFragViewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        databindingFragViewBinding.tvInfo.text="我要努力呀"
    }

}