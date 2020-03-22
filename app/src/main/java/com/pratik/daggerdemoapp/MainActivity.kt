package com.pratik.daggerdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val carComponent = DaggerCarComponent.create()
        carComponent.car.drive("Driving now !!!")
    }
}
