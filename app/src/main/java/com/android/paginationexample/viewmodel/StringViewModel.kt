package com.android.paginationexample.viewmodel

class StringViewModel {
    private val strings = mutableListOf<String>()

    fun init() {
        // Add 100 strings to the list
        for (i in 1..100) {
            strings.add("String $i")
        }
    }

    fun getStrings(): List<String> {
        return strings
    }
}