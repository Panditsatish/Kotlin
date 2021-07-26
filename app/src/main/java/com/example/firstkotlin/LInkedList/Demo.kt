package com.example.firstkotlin.LInkedList
fun main(args: Array<String>) {
    val arr = intArrayOf(900, 940, 950, 1100, 1500, 1800)
    val dep = intArrayOf(910, 1200, 1120, 1130, 1900, 2000)
    val n = 6
    println(findPlatform(arr, dep, n) )
}
fun findPlatform(
        arr: IntArray, dep: IntArray,
        n: Int
    ): Int {
        var plat_needed = 1
        var result = 1
        var i = 1
        var j = 0

        i = 0
        while (i < n) {
            plat_needed = 1
            j = i + 1
            while (j < n) {
                if (arr[i] >= arr[j] && arr[i] <= dep[j]
                    || (arr[j] >= arr[i]
                            && arr[j] <= dep[i])
                ) plat_needed++
                j++
            }
            result = Math.max(result, plat_needed)
            i++
        }
        return result
    }
