package com.m470.twins

import org.junit.Test

import org.junit.Assert.*

class MainViewModelTest {

    @Test
    fun testCompareTexts() {
        val viewModel = MainViewModel()

        val result1 = viewModel.compareTexts("Hello", "Hello")
        assertEquals("Los textos son iguales", result1)

        val result2 = viewModel.compareTexts("Hello", "World")
        assertEquals("Los textos son diferentes", result2)
    }
}