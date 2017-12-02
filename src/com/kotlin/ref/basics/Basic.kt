package com.kotlin.ref.basics

/**
 * Created by rajeevranganathan
 */


fun printWelcomMessage(){
    print("Hellloowww Kotlin!!")
}


/*
fun sum(a:Int,b:Int):Int{
    return a+b;
}
*/

/**
 * If theres only one line,no need of braces
 */
fun sum(a:Int,b:Int)=a+b
fun someFunction(){
    val a:Int = 3
    val b=6
    val c:Int
    c=7

    print("a has the value $a,while b & c has $b & $c respectively.Total sum is ${a+b+c}")
}

fun funWithStrings(){
    val a = "Some string"
    var b = "${a.replace('o','a')},o replaced by a"
    print(b)
}

fun maxOf(a:Int,b:Int)=if (a > b) a else b
fun max(a:Int,b:Int){
    print(maxOf(a,b))
}
fun main(args: Array<String>) {
    //printWelcomMessage()
    //print(sum(5,3))
    //someFunction()
   // funWithStrings()
    max(5,6)
}

