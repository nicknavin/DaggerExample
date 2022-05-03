package com.example.daggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUser():UserRegistrationService
    fun getEmailService() : EmailService
}