package com.example.firstkotlin

import java.util.*

fun main(args:Array<String>){
    val sc=Scanner(System.`in`);
    println("Enter the String")
    var str=sc.nextLine()
    var str1=str.reversed()
    if(str==str1)
        println("palindrom")
    else
        println("Not")
}