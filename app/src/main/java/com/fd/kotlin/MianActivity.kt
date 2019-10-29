package com.fd.kotlin

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.Toast
import com.fd.kotlin.Databinding.DataBindingFragActivity
import com.fd.kotlin.Databinding.DatabindingActivity
import com.fd.kotlin.adapter.ListDataAdapter
import com.fd.kotlin.constant.Constant
import com.gsww.kotlin.entity.TopObj
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response
import com.lzy.okgo.request.base.Request

import kotlin.collections.ArrayList


/**
 * @author   fengda
 * @time     2019/10/23 11:22
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */

class MianActivity : AppCompatActivity() {
    private lateinit var mRelView: RecyclerView
    private lateinit var mIvImg:ImageView
    private var list:ArrayList<TopObj.TopLine>?=null
    private var listAdapter: ListDataAdapter? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        initView()
        initData()

    }

    private fun initView() {
        mRelView = findViewById<RecyclerView>(R.id.rel_view)
        mIvImg=findViewById<ImageView>(R.id.iv_img)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        mRelView.layoutManager = layoutManager
         list=ArrayList()
        listAdapter= ListDataAdapter(list,this)
          mRelView.adapter=listAdapter
        listAdapter?.setItemClickListener(object :ListDataAdapter.ItemClickListener{
            override fun onItemClickListener(t: TopObj.TopLine) {
                startActivity(Intent(this@MianActivity,DatabindingActivity::class.java))
            }
        })
        mIvImg.setOnClickListener {
            startActivity(Intent(this@MianActivity, DataBindingFragActivity::class.java))
        }

    }


    private fun initData() {
     OkGo.post<String>(Constant.YOULING_API)
         .params("uid", Constant.UID)
         .params("appkey", Constant.APP_KEY)
         .params("type", "0")
         .execute(object :StringCallback(){
             override fun onSuccess(response: Response<String>) {
                 val body = response.body()
                 val topObj:TopObj = TopObj.objectFromData(body)
                 if (topObj.code.equals("1000")) {
                     list!!.addAll(topObj.datas!!)
                     listAdapter?.notifyDataSetChanged()
                 }else{
                     Toast.makeText(baseContext,topObj.msg,Toast.LENGTH_SHORT).show()
                 }


             }

             override fun onStart(request: Request<String, out Request<Any, Request<*, *>>>?) {
                 super.onStart(request)
             }

             override fun onError(response: Response<String>?) {
                 super.onError(response)
             }
         })
    }


}