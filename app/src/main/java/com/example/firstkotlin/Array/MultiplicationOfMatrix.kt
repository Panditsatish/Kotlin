package com.example.firstkotlin.Array

import java.util.*

fun main(args:Array<String>){
    val sc= Scanner(System.`in`)

    println("enter size of array")
    val num=sc.nextInt()
    var array1=Array<Int>(num){0}
    var array2=Array<Int>(num){0}
    var sum:Int=0
    println("Enter elements of first Array")
   for (i in array1.indices) array1[i]=sc.nextInt()
    println("Enter elements of second Array")
    for (i in array2.indices) array2[i]=sc.nextInt()
    println("press 1 for Add \npress 2 for sub")
    var choice=sc.nextInt()
    when(choice){
        1-> for(i in 0..num-1){
            sum+=array1[i]+array2[i]
        }
        2 -> for(i in 0..num-1){
            sum+=array1[i]-array2[i]
        }
        else -> println("you r press wrong key")

    }
println("sum of Array is : $sum")
}