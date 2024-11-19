package com.betulesen.yemektarifleriapp.roomdb

import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.RoomDatabase
import com.betulesen.yemektarifleriapp.model.Tarif

@Database(entities = [Tarif::class],version = 1)
abstract class TarifDatabase : RoomDatabase() {
    abstract fun tarifDao():TarifDAO
}