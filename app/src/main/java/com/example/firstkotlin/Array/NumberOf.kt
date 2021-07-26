package com.example.firstkotlin.Array

fun main(args:Array<String>){
    var Array= arrayOf(1,2,1,2,3,4)
    for (i in Array.indices) {
        var count: Int = 1
        for (j in Array.indices) {
            if (i == j)
                continue
            else if (Array[i] == Array[j]) {
                count++  }
        }
        if (count % 2 != 0) {
            println(Array[i])
    }}}