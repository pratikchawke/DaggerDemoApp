package com.pratik.daggerdemoapp

import android.util.Log

import javax.inject.Inject

class Car @Inject
constructor(private val engine: Engine, private val wheels: Body) {

    private val TAG = Car::class.java.simpleName

    fun drive(msg: String) {
        Log.d(TAG, msg)
    }

}
