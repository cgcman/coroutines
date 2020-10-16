package com.example.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main(){
    runBlocking {
        val firsDeferred = async { getFirstValue() }
        val secondDeferred = async { getSecondValue() }
        println("Prossesing")
        delay(500L)
        println("Waiting")

        val firstValue = firsDeferred.await()
        val secodValue = secondDeferred.await()

        println("Calc ${firstValue + secodValue}")
    }
}

suspend fun getFirstValue(): Int{
    delay(1000L)
    val value = Random.nextInt(100)
    println("1 Value $value")
    return value
}


suspend fun getSecondValue(): Int{
    delay(2000L)
    val value = Random.nextInt(1000)
    println("2 Value $value")
    return value
}
