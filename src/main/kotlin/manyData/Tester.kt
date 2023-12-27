package manyData

fun main() {
    val list: List<Int> = listOf(2, 3, 5, 7, 11)
    println(list)
    val scores = listOf(20,60,80,100,90)
    for (i in scores){
        println(i)
    }
    println(scores.get(3))
    var mutableList:MutableList<Int> = mutableListOf<Int>(20,100,90,60,70)
    mutableList.add(66)
    println(mutableList)
}

class Tester {


}