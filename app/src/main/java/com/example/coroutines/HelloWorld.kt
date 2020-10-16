package com.example.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var functionCall = 0

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
    //Thread.sleep(5000)
    GlobalScope.launch { completeMesagge() }
    GlobalScope.launch { improveMessage() }
    //print("Hello, ")
    //Thread.sleep(2000L)
    //println("Is, $functionCall")
}

suspend fun completeMesagge(){
    //delay(500L)
    println("World")
    functionCall++
}

suspend fun improveMessage(){
    //delay(1000L)
    println("Cool")
    functionCall++
}