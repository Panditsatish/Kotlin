package com.example.firstkotlin

import java.util.*

fun main(args:Array<String>){
   var sc = Scanner(System.`in`)
    println("Enter the String")
    var str=sc.nextLine()
    println(Reverse(str))
}
fun Reverse(str:String) : String {
    if(str.length <= 1)
        return str
    else
        print(str.toCharArray(str.length-1))
        return Reverse(str.substring(0,str.length-1))


}