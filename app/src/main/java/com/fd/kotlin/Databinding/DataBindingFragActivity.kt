package com.fd.kotlin.Databinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import com.fd.kotlin.Databinding.fragment.DatabindingFragment
import com.fd.kotlin.R

/**
 * @author   fengda
 * @time     2019/10/28 15:58
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class DataBindingFragActivity : AppCompatActivity() {

    lateinit var mFrlView: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.databinding_frag_layout)
        mFrlView = findViewById<FrameLayout>(R.id.frl_view)
        initView()

    }

    private fun initView() {
        val fragment = DatabindingFragment()
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.frl_view, fragment).commit()
    }


}