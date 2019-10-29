package com.fd.kotlin.databinding

import com.fd.kotlin.databinding.bean.Image
import java.util.*
import kotlin.collections.ArrayList

/**
 * @author   fengda
 * @time     2019/10/29 16:26
 * @desc     TODO
 * @updateAuthor  Author
 * @updateDate    Date
 */

class HandlerClick {
    var list=ArrayList<String>()

    fun onClick(image: Image){
        list.add("http://07imgmini.eastday.com/mobile/20191028/20191028163943_563e663f8b08ff0529504bea402899e9_2_mwpm_03200403.jpg")
        list.add("http://01imgmini.eastday.com/mobile/20191028/20191028164403_a622c65741d21ef9e4887b37f360a3b8_2_mwpm_03200403.jpg")
        list.add("http://05imgmini.eastday.com/mobile/20191028/20191028164451_68b02bc2edee930e87c0be7fc91e33c2_2_mwpm_03200403.jpg")
        list.add("http://03imgmini.eastday.com/mobile/20191028/20191028164714_7e301f92c560751fc3905f9ebd27bfcc_3_mwpm_03200403.jpg")
        list.add("http://05imgmini.eastday.com/mobile/20191028/20191028164721_cc86c51751917c811b208403b41b8fae_1_mwpm_03200403.jpg")
        val random= Random().nextInt(4)
        image.url!!.set(list.get(random))
//        image.url.set(list.get(random))
    }


}