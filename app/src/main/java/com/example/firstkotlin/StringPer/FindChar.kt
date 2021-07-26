package com.example.firstkotlin

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter the String")
    val str = sc.nextLine().toCharArray()
    var count: Int = 0
    for (i in str.indices)
        for (j in str.indices) {
            if (i == j)
                continue
            else
                if (str[i] == str[j])
                    continue
                else
                    if (count == 0 && str[i] != str[j])
                        println(str[j])
            break;
        }

}