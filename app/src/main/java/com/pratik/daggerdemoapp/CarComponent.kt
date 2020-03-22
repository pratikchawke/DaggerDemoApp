package com.pratik.daggerdemoapp

import dagger.Component

@Component
interface CarComponent {

    val car: Car
}
