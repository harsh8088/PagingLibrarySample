package com.hrawat.paginglibrarysample

import android.arch.lifecycle.ViewModel

/**
 * Created by hrawat on 11/16/2017.
 */
class UserProfileViewModel: ViewModel() {
    lateinit var userId:String
    lateinit var user :User


   fun init(userId:String){

    }

    fun getUser(): User {
        return user
    }

}