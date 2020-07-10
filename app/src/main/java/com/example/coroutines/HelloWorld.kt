package com.example.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    GlobalScope.launch {
        delay(3000)
        println("nice")
    }
    runBlocking {
        repeat(100){
            launch {
                println("inblocking")
            }
        }
    }
    println("Hello")
    Thread.sleep(5000)
}