package com.kotlin.ref.basics

/**
 * Created by rajeevranganathan
 */


fun main(args: Array<String>) {
    createAndPrintOneWay()

}

fun createAndPrintOneWay() {
    val arr = arrayOf(1, 2, 3, 5);
    println("Size of array is ${arr.size}")
    for (i in arr) {
        println(i)
    }

    val stringArr = arrayOf("Sunday","Monday","Tuesday")
    for(str in stringArr){
        println(str)
    }
}

fun createAndPrintOtherWay(){
    val arr = intArrayOf(1,2,3)
    for (i in arr) {
        println(i)
    }
}