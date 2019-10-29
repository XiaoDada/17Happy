package com.fd.kotlin.Databinding

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fd.kotlin.R
import com.fd.kotlin.bean.User
import com.fd.kotlin.databinding.DatabingLayoutBinding

/**
 * @author   fengda
 * @time     2019/10/28 14:09
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class DatabindingActivity : AppCompatActivity() {

   lateinit var mBinding :DatabingLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     mBinding= DataBindingUtil.setContentView(this,R.layout.databing_layout)
      var user= User("刘然","123456")
        mBinding.user=user

    }

}