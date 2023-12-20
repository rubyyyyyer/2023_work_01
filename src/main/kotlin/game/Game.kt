package game

import java.util.Scanner
import kotlin.random.Random

fun main() {
//    val scanner = Scanner(System.`in`)
    val randomNum = Random.nextInt(10)+1
    var userInput = 0
    println("秘密數字:$randomNum")
    while (userInput!=randomNum) {
        print("Please enter a number:")
//        userInput = scanner.nextInt()
        userInput = readLine()!!.toInt()
//        println("使用者輸入:$userInput")
        if (userInput<randomNum){
            println("Higher")
        }else if(userInput>randomNum){
            println("Lower")
        }else{
            println("Great! The number is $randomNum")
        }
    }
}
class Game {
}