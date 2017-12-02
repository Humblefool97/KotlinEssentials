package com.kotlin.ref.basics

/**
 * Created by rajeevranganathan
 */


fun main(args: Array<String>) {
    rawStrings()
}

fun rawStrings(){
    var rawStr = """
        I dont know what to type
        I am just typing
        """
    print("Length of the above String is ${rawStr.length}")

    //Adds hellow in the next line!
    rawStr=rawStr.plus("Helloooww!")
    print(rawStr)
}