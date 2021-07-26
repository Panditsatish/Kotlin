package com.example.firstkotlin

import java.util.*

fun main(args:Array<String>){
    println("Enter the String")
    val sc=Scanner(System.`in`)
    var str=sc.nextLine().toLowerCase()
    var array=str.toCharArray()
    var count:Int=0
    val l=array.size
    for (i in array.indices){
        if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
            count++
    }
    if(count==0){
        println("Number of Consonant is $l")
    println("Number of vowel is $count")
    }
    else{
        println("Number of Consonant is "+ (l-count))
        println("Number of vowel is $count")
    }

}