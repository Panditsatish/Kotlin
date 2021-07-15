package com.example.firstkotlin

/*
* this the main fun or enter point of any kotlin
* here we start the program
* */
fun main() {
    var Mystrin = "Hello World"//this is the mutable in nature
    val Mystring = "Hello Guys"// this is the immutable in the nature
    println(Mystring)
    println(Mystrin)
    sum(12,14)
    var num=arrayOf(1,2,3,6,7,8,4,9)
    for(i in 2..5)
        println(num[i])
}
fun sum(Num1:Int,Num2:Int) {
    var c=Num1+Num2
    println("this is the Addition of two number i.e;   $c")
    c=Num1-Num2
    println("this is the Subtraction of two number i.e;  $c")
    c=Num1*Num2
    println("this is the Multiplication  of two number i.e;  $c")
    c=Num1/Num2
    println("this is the Division  of two number i.e;  $c")
    c=Num1%Num2
    println("this is theModulo of two number i.e;  $c")
}