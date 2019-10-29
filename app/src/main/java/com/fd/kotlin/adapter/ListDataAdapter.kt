package com.fd.kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.fd.kotlin.R
import com.gsww.kotlin.entity.TopObj

/**
 * @author   fengda
 * @time     2019/10/23 14:50
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class ListDataAdapter : RecyclerView.Adapter<ListDataAdapter.ListViewHolder> {
    private var list: ArrayList<TopObj.TopLine>? = null
    private var context: Context? = null

    constructor(list: ArrayList<TopObj.TopLine>?, context: Context?) {
        this.list = list
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ListViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_data_list, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        val t: TopObj.TopLine = list?.get(position)!!
        //方法一：
        listViewHolder.tvTitle.text = t.title
        listViewHolder.tvAuthor.text = t.authorName
        listViewHolder.tvTime.text = t.date
        Glide.with(context!!).load(t.thumbnailPicS).into(listViewHolder.ivImg)
        //点击事件
        listViewHolder.itemView.setOnClickListener {
            itemClickListener?.onItemClickListener(t)
        }
      //方法二：
        with(t){
            listViewHolder.tvTitle.text = title
            listViewHolder.tvAuthor.text = authorName
            listViewHolder.tvTime.text = date
            Glide.with(context!!).load(thumbnailPicS).into(listViewHolder.ivImg)
        }
        //方法三：
        list?.get(position)?.run {
            listViewHolder.tvTitle.text = title
            listViewHolder.tvAuthor.text = authorName
            listViewHolder.tvTime.text = date
            Glide.with(context!!).load(thumbnailPicS).into(listViewHolder.ivImg)
        }

        //方法一：传统方法
        listViewHolder.tvTitle.setOnClickListener (object :View.OnClickListener{
            override fun onClick(v: View?) {
            }
        })
        //方法二：借助kotlin的智能类型推断的lambda
        listViewHolder.tvTitle.setOnClickListener {
            view->
        }
        //方法三：使用lambda表达式的简约写法
        listViewHolder.tvTitle.setOnClickListener {
                view:View ->

        }
    }


    class ListViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var tvTitle: TextView = itemView!!.findViewById(R.id.tv_title)
        var ivImg: ImageView = itemView!!.findViewById(R.id.iv_img)
        var tvAuthor: TextView = itemView!!.findViewById(R.id.tv_author)
        var tvTime: TextView = itemView!!.findViewById(R.id.tv_time)
    }

    private var itemClickListener: ItemClickListener? = null

    fun setItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    interface ItemClickListener {

        fun onItemClickListener(t: TopObj.TopLine)
    }


}