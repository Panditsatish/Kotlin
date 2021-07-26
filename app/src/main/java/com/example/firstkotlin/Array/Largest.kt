package com.example.firstkotlin.Array

import java.util.*

fun main(args:Array<String>){
    val sc=Scanner(System.`in`)
    println("Enter the size of Array")
    val num=sc.nextInt()
    var array = Array<Int>(num){0}
    println("Enter the elements of Array")
    for (i in array.indices){
        array[i]=sc.nextInt()
    }
    array.sort()
    println(array.contentToString())
   println("Second Largest element is :"+array.get(array.size-2))

}