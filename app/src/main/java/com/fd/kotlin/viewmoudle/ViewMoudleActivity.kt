package com.fd.kotlin.viewmoudle

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fd.kotlin.R
import com.fd.kotlin.databinding.ActivityTeamLayoutBinding

class ViewMoudleActivity :AppCompatActivity(){
   lateinit var  viewModel : ViewModel
    lateinit var binding: ActivityTeamLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView<ActivityTeamLayoutBinding>(this, R.layout.activity_team_layout)
        viewModel= ViewModelProviders.of(this).get(ViewModel::class.java)
        binding.setVariable(R.layout.activity_team_layout,viewModel)
        binding.lifecycleOwner=this
    }




}