package com.example.daggerexample

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "nimade.navin@gmail.com", "User registered")
    }
}