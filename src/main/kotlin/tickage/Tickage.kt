package tickage

import kotlin.random.Random

data class Tickage(val origin:Int, val destination:Int, val price:Int)
//可以設計後續的功能，也可以不要，一般的java POJO 資料類別或是模組的話，那可以不用加上大括號設計功能。

fun main() {
    val tickage = Tickage(20,50,400)
    val s = "ABCDE"
    println(s.validate())
    println((1..10).random())
}

fun String.validate():Boolean{
    return this.length >=6
}

fun IntRange.random():Int{
    //1..10 Kotlin中的範圍，endInclusive(尾值10)、start(初始值1)
    val randomNum = Random.nextInt(endInclusive-start)+start
    return randomNum
}