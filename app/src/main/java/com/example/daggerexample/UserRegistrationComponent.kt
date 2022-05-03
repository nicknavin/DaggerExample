package com.example.daggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun myConsumer(mainActivity: MainActivity)
}