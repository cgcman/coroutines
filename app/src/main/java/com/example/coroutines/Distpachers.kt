package com.example.coroutines

import kotlinx.coroutines.*

fun main(){
    runBlocking {
        /*try {
            launch(Dispatchers.Main){
                println("Main ${Thread.currentThread().name}")
            }
        }catch (ext: Exception){
            println("Error ${ext}")
        }*/

        launch(Dispatchers.Unconfined) {
            println("Uncofined ${Thread.currentThread().name}")
            delay(100L)
            println("Uncofined2 ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default){
            println("Default ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO){
            println("IO ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("Mythread")){
            println("NEW ${Thread.currentThread().name}")
        }
    }
}