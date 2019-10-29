//package com.fd.kotlin
//
//
//import android.graphics.drawable.Drawable
//import rx.Observable
//import rx.Observer
//import rx.Subscriber
//import rx.android.schedulers.AndroidSchedulers
//import rx.schedulers.Schedulers
//
///**
// * @author fengda
// * @time 2019/10/25 18:25
// * @desc TODO
// * @updateAuthor Author
// * @updateDate Date
// */
//class rxjava {
//
//    private fun initView() {
//
//        Observable.create(Observable.OnSubscribe<Drawable> { subscriber -> subscriber.onCompleted() })
//            .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
//            .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在主线程
//            .subscribe(object : Observer<Drawable> {
//                override fun onNext(drawable: Drawable) {}
//
//                override fun onCompleted() {}
//
//                override fun onError(e: Throwable) {}
//            })
//    }
//
//}
