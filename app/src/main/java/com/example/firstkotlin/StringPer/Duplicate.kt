package com.example.firstkotlin

import java.util.*

fun main(args: Array<String>) {
    println("Enter the String")
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()
    str = str.toLowerCase()
    var ch: Char
    for (i in 0 until str.length) {
        ch = str[i]
        for (j in i + 1 until str.length)
            if (ch == str[j])
                println(ch)
    }
}
