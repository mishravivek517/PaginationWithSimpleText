package com.android.paginationexample.viewmodel

class StringViewModel {
    private val strings = mutableListOf<String>()
    private var currentPage = 1

    fun init() {
        // Add 100 strings to the list
        for (i in 1..100) {
            strings.add("String $i")
        }
    }

    fun getStringsForCurrentPage(): List<String> {
        val startIndex = (currentPage - 1) * 20
        val endIndex = startIndex + 20

        return strings.subList(startIndex, endIndex)
    }

    fun getNextPage() {
        currentPage++
    }

}