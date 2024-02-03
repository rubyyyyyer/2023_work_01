package box

import java.util.Scanner


fun main() {
    //Box obj
    //A:長23      寬14      高13 (cm)
    //B:長39.5    寬27.5    高23 (cm)
    val userInput = userInput()
    val userInputNum = UserPackage(userInput[0], userInput[1], userInput[2])
    val regularSizeA = RegularSize(23f, 14f, 13f)
    val regularSizeB = RegularSize(39.5f, 27.5f, 23f)

    var checkAReList = regularSizeA.reorder()
    var checkAPoint = regularSizeA.checkBox(userInputNum, regularSizeA)

    var checkBReList = regularSizeB.reorder()
    var checkBPoint = regularSizeB.checkBox(userInputNum, regularSizeB)

    println("checkAList:$checkAReList")
    println("checkBList:$checkBReList")
    println("checkAList:$checkAPoint")
    println("checkBList:$checkBPoint")

    if (checkAPoint == 3 && checkBPoint == 3) {
        println("放在A盒子,比較省錢")
    } else if (checkAPoint < 3 && checkBPoint < 3) {
        println("沒有盒子可以放")
    } else if (checkAPoint == 3) {
        println("放在A盒子")
    } else if (checkBPoint == 3) {
        println("放在B盒子")
    }
}

fun userInput(): MutableList<Float> {
    val scanner = Scanner(System.`in`)
    print("請用空白鍵間隔輸入長、寬、高:")
    val userInput = scanner.nextLine()
    val userInputString: MutableList<String> = userInput.split(" ").toMutableList()
    val userInputNum: MutableList<Float> = mutableListOf()
    for (item in userInputString) {
        userInputNum.add(item.toFloat())
    }
    return userInputNum
}

