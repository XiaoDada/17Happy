package com.fd.kotlin.databinding.bean

import android.databinding.ObservableField

/**
 * @author   fengda
 * @time     2019/10/29 17:50
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */
class Image(url:String) {
    var url: ObservableField<String>? = null

    init {
        this.url = ObservableField(url)
    }


}