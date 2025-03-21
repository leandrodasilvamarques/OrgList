package com.leoandemy.orglist.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.leoandemy.orglist.databinding.ActivityGuestsFormBinding
import com.leoandemy.orglist.viewmodel.GuestsFormViewModel

class GuestsFormActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityGuestsFormBinding
    lateinit var viewModel: GuestsFormViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestsFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestsFormViewModel::class.java)
        binding.buttonSalvar.setOnClickListener(this)
        binding.radioPresente.isChecked = true

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}