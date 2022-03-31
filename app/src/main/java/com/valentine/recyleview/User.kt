package com.valentine.recyleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



//pojo
@Parcelize
data class User(
    val username:String,
    val phoneNumber:Long,

    ): Parcelable
