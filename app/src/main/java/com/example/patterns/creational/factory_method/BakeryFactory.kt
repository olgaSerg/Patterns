package com.example.patterns.creational.factory_method

class BakeryFactory {

    companion object {
        const val BREAD = "BREAD"
        const val BAG = "BAG"
        const val PIE = "PIE"
    }

    fun getBakery(string: String): BakeryProduct {
        return when (string) {
            BREAD -> Bread()
            BAG -> Baguette()
            PIE -> Pie()
            else -> Bread()
        }
    }
}