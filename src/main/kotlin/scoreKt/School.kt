package scoreKt

import java.util.Scanner
import kotlin.random.Random

fun main() {
//    userInput()
    Student.pass = 80
    val studentA = Student("Ruby", "1200",70,80)
    val studentB = Student("Eric","1201",90,20)
    val studentC = Student("Jane","1222",60,90)
    studentA.showScore()
    studentB.showScore()
    studentC.showScore()

}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("name:")
    var name = scanner.next()
    val id = Random.nextInt(0, 1001).toString()
//    val id = (0..1000).random().toString()
    println(id)
    print("eng?")
    var eng = scanner.nextInt()
    print("math?")
    var math = scanner.nextInt()
    Student(name, id, eng, math).showScore()
}