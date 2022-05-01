package com.example.daggerexample

import android.util.Log

class EmailService {

    fun send(email:String,from:String,body:String)
    {
Log.d(TAG,"mail is send email: $email , from: $from ,body: $body")
    }
}