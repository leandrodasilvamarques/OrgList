package com.leoandemy.orglist.repository

import android.content.ContentValues
import android.content.Context
import com.leoandemy.orglist.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!::repository.isInitialized) repository = GuestRepository(context)
            return repository
        }
    }

    fun insert(guest: GuestModel){
        val db = guestDataBase.writableDatabase
        val values = ContentValues()

        val presence = if (guest.presence) 1 else 0
        values.put("presence", presence)
        values.put("name", guest.name)

        db.insert("Guest", null, values)
    }
}