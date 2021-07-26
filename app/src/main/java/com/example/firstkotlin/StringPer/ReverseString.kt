package com.example.firstkotlin

import java.util.*

fun main(agrs:Array<String>){
    val sc=Scanner(System.`in`)
    println("Enter the string that you want to reverse")
    var string=sc.nextLine().split(" ")
    var n=string.size
    for(i in n-1 downTo 0){
        print(string[i]+" ")
    }
    println()
}