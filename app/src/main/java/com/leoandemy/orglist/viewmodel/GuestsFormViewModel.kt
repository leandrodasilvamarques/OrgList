package com.leoandemy.orglist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.leoandemy.orglist.repository.GuestRepository

class GuestsFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)
}