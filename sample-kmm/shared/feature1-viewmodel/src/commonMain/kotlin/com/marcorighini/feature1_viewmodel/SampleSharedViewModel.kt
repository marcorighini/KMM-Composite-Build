package com.marcorighini.feature1_viewmodel

import com.marcorighini.feature1business.SomeClass

class SampleSharedViewModel {

    private val greeting = SomeClass()

    val state = greeting
}