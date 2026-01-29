package ru.behavior.lesson_2

import kotlin.math.pow

fun main() {

    val baseRate = 1.0
    val percentageBase = 100.0
    val amount: Int = 70_000
    val annualRate: Double = 16.7
    val years: Int = 20

    val finalAmount: Double = amount * (baseRate + annualRate / percentageBase).pow(years)

    println("%.3f".format(finalAmount))

}