package com.kotlin.ref.basics

/**
 * Created by rajeevranganathan
 */

fun main(args: Array<String>) {
    //println(maxInTwo(2, 3))
    //fullName("Sheldon")
    fullName("Penny")

}

/*
aaarrrrrgghhh...!need a better one
fun maxInTwo(a:Int,b:Int):Int{

    if(a >b){
        a
    }else{
        b
    }
}*/


//if doesn't need return as it returns implicitly
fun maxInTwo(a: Int, b: Int) = if (a > b) a else b

//Switch is replaced by when
//If many cases can be handled in the same way,use ','
fun fullName(choice: String) {
    when (choice) {
        "Shelly",
        "Sheldon" -> println("Sheldon Lee Cooper ")
        "Leonard" -> println("Leonard hofstadter")
        "Raj" -> println("Raj Koothrapalli")
        "Howy",
        "Howard" -> println("Howard Wolowitz")
        else -> {
            println("I don't know")
        }
    }
}