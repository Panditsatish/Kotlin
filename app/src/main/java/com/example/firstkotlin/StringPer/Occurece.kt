package com.example.firstkotlin

import java.util.*

fun main(args:Array<String>){
    println("Enter the String ")
    val sc=Scanner(System.`in`)
    var str=sc.nextLine().toLowerCase()
    println("enter the character")
    var ch=sc.next().toLowerCase().get(0)
    occur(str,ch)

}
fun occur(str: String, ch: Char) {
    var count: Int = 0
    for (i in str.indices) {
        if (str.get(i) == ch) {
            count++
        }
    }
    println("$ch=$count")
}