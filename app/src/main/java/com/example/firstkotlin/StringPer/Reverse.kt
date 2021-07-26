package com.example.firstkotlin

fun main(args:Array<String>){
    val array = intArrayOf(2, 3, 5, -1, 9, 4, -4)
    val Arr = IntArray(array.size)
    for (i in array.indices) {
        for (j in array.indices) {
            if (i == j) continue else Arr[i] += array[j]
        }
    }
    for (i in Arr.indices) {
        println(Arr[i])
    }
}
