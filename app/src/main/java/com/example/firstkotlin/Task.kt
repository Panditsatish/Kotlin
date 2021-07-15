package com.example.firstkotlin

fun main(args: Array<String>) {
    val list = mutableListOf<String>(
        "Ajay",
        "Vijay",
        "Prakash",
        "Ashish",
        "satish",
        "riya",
        "priya",
        "Anmol",
        "suraj"
    )
    var list1 = mutableListOf<String>(
        "Ajay",
        "Vijay",
        "Prakash",
        "Munsi",
        "Shiva",
        "Raja",
        "Bheem",
        "Niraj"
    )
    var list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(find(list, "ay"))
    println(partition(123))
    println(sum(list2))
    println(findName(list, list1))
}

fun find(ls: MutableList<String>, str: String): MutableList<String> {
    var ab = mutableListOf<String>();
    for (i in ls.indices) {
        if (ls.get(i).contains(str)) {
            ab.add(ls.get(i))
        }
    }
    return ab
}

fun findName(ls: MutableList<String>, str: MutableList<String>): MutableList<String> {
    var ab = mutableListOf<String>();
    for (i in ls.indices)
        for (j in str.indices) {
            if (ls.get(i) == str.get(j)) {
                ab.add(str.get(j));
            }
        }
    return ab;
}

fun sum(ls: MutableList<Int>): Int {
    var a = 0;
    for (i in ls.indices) {
        a += ls.get(i)
    }
    return a
}

fun partition(PageNo: Int): Int {
    return PageNo / 10 + 1;
}