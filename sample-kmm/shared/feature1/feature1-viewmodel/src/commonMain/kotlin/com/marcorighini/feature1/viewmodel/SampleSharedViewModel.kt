package com.marcorighini.feature1.viewmodel

import com.marcorighini.feature1.business.SomeClass

class SampleSharedViewModel {

    private val greeting = SomeClass()

    val state = greeting
}