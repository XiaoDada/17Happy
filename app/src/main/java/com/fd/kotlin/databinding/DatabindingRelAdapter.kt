package com.fd.kotlin.databinding

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fd.kotlin.R
import com.gsww.kotlin.entity.TopObj

/**
 * @author   fengda
 * @time     2019/10/29 20:07
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class DatabindingRelAdapter (var list: ArrayList<TopObj.TopLine>, val context: Context?):RecyclerView.Adapter<DatabindingRelAdapter.ViewHolder>(){
    override fun getItemCount(): Int {
       return list.size
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
      val viewDataBinding=DataBindingUtil.inflate<ItemDataBindingListBinding>(LayoutInflater.from(p0.context), R.layout.item_dataBinding_list,p0,false)
        return ViewHolder(viewDataBinding)
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
//         p0.dataBinding?.setVariable(.)

    }



    class ViewHolder (viewDataBinding: ViewDataBinding):RecyclerView.ViewHolder(viewDataBinding.root){
        var dataBinding: ViewDataBinding? = viewDataBinding
    }


}