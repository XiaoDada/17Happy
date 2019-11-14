package com.fd.kotlin.viewmoudle

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ViewModel :ViewModel(){
    var aTeamScore=MutableLiveData<Int>()
    var bTeamScore=MutableLiveData<Int>()

    fun   getaTeamScore() :MutableLiveData<Int>{
        return aTeamScore
    }
    fun   getbTeamScore() :MutableLiveData<Int>{
        return bTeamScore
    }
    fun aTeamAdd(p:Int){

        aTeamScore.value= aTeamScore.value?.plus(p)
    }

    fun bTeamAdd(p:Int){

        bTeamScore.value= bTeamScore.value?.plus(p)
    }

    fun reset(){
        aTeamScore.value=0
        bTeamScore.value=0
    }




}