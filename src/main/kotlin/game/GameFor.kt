package game

import java.util.Random
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`);
    var secretNum = Random().nextInt(10)+1
    println("秘密數字:$secretNum")
    for(i in 1..5) {
        println("請猜一個數字(${i}/5):")
        var userInput = scanner.nextInt()
        if (userInput>secretNum){
            println("小一點")
        }else if(userInput<secretNum){
            println("大一點")
        }else{
            println("猜對了!秘密數字就是:$secretNum")
            break
        }
        println("居然都沒猜到!秘密數字是:$secretNum")
    }
}

class GameFor {
}