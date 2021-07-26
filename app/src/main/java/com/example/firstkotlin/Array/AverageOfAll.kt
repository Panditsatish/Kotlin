package com.example.firstkotlin.Array

import java.util.*

fun main(args: Array<String>) {
    println("Enter the size of Array")
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    var array = Array<Int>(num) { 0 }
    println("Enter the Elements of Array")
    for (i in array.indices) {
        array[i] = sc.nextInt()
    }
    var sum: Int = 0
    for (i in array.indices) {
        sum += array[i]
    }
    val result: Int = sum / num
    println("Average of number is : $result")
}