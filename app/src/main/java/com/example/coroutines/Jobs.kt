package com.example.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val job1 = launch {
            //delay(3000L)
            println("Job1 launched")
            val job2 = launch {
                println("Job2 launched")
                delay(3000L)
                println("Job2 finished")
            }
            job2.invokeOnCompletion { println("Job2 Completed") }
            val job3 = launch {
                println("Job3 launched")
                delay(3000L)
                println("Job3 finished")
            }
            job3.invokeOnCompletion { println("Job3 Completed") }
        }

        job1.invokeOnCompletion { println("Job1 Completed") }


        delay(500L)
        println("Job1 will cancel")
        job1.cancel()
    }
}