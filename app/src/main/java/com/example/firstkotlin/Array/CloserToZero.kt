package com.example.firstkotlin.Array

import java.util.*

fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter the size of Array")
    var num=sc.nextInt()
    var array=Array<Int>(num){0}
    println("Enter element of Array")
    for (i in array.indices){
        array[i]=sc.nextInt()
    }
}
fun ZerosCloser(array:Array<Int>){
    var ar=Array<Int>(100){0}
    for (i in array.indices-1)
        for (j in i+1..array.size-1 ){
            ar[i]=array[i]+array[j]

        }
}