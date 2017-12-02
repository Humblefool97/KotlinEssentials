package com.kotlin.ref.basics

/**
 * Types supported
 * Byte-8
 * Short-16
 * Int-32
 * Float-32
 * Long-64
 * Double-64
 *
 * Created by rajeevranganathan
 */

fun main(args: Array<String>) {
    leftShift(1)
}

fun floatToInt(a:Int,b:Char){
    //using c=a will throw a compilation error!
    val c:Float = a.toFloat()

    //using d=b will throw a compilation error!
    val d:Int = b.toInt()
}

fun leftShift(a:Int){
    print(a.shl(3))
}

