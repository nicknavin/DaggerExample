package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(email: String, from: String, body: String) {
        Log.d(TAG, "mail is send email: $email , from: $from ,body: $body")
    }
}