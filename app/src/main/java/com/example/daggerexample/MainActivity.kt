package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerUserRegistrationComponent.builder().build();
        val userRegistrationService=component.getUser()
        val emailService = component.getEmailService()
        userRegistrationService.registerUser("nimade.navin@gmail.com", "111111")
    }
}