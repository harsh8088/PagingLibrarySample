package com.hrawat.paginglibrarysample.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase



/**
 * Created by hrawat on 11/16/2017.
 */
@Database(entities = arrayOf(User::class), version = 1)
abstract class MyDatabase : RoomDatabase()