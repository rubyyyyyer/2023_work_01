package scoreKt

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    print("name:")
    var name = scanner.next()
    val id = Random.nextInt(0,1001).toString()
//    val id = (0..1000).random().toString()
    println(id)
    print("eng?")
    var eng = scanner.nextInt()
    print("math?")
    var math = scanner.nextInt()
    Student(name, id, eng, math).showScore()
}