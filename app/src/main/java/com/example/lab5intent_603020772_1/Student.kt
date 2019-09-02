package com.example.lab5intent_603020772_1

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Student (val id:String, val name: String, val age: Int) : Parcelable {

}
