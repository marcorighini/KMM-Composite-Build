package com.marcorighini.samplekmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}