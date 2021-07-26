package com.example.firstkotlin.Array

import java.util.*

fun main(args:Array<String> ){
    println("enter the size of Array")
    val sc=Scanner(System.`in`)
    var num=sc.nextInt()
    var array=Array<Int>(num){0}
    println("Enter the elements of Array")
    for(i in array.indices) {
        array[i]=sc.nextInt()
    }
    var ar=array.contentToString()
    println("enter the element u want to search in array")
    var element=sc.nextInt()
    var l=array.size
    var low:Int=0
BinarySearch(array,low,l-1,element)

}
fun BinarySearch(ar:Array<Int>,low:Int,upp:Int,ele:Int):Int{
    var low=0
    //var upp=ar.get(l-1)
    var mid:Int=0
    if(upp%2==0)
        mid=upp/2
    else
        mid=low + (upp+1-low)/2
    if(ar[mid]==ele)
        println("Element $ele is found at index of : $mid")
    else if (ar[mid]<ele)
       return BinarySearch(ar,low=mid +1,upp,ele)
    else
       return BinarySearch( ar,low,upp=mid-1,ele)
return 0
}