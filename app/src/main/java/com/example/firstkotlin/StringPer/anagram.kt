package com.example.firstkotlin

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter the first string")
    val str1 = sc.nextLine().toLowerCase()
    println("Enter the Second string")
    val str2 = sc.nextLine().toLowerCase()
    var Array2=str2.toCharArray().sort()
    var Array =str1.toCharArray().sort()
    if (Array.equals(Array2)) {
        println("String 1 is $str1 and String two $str2 is an Anagram")
    } else
        print("Not Anagram")
}


