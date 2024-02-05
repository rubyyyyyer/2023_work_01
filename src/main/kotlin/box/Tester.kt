package box

import java.util.Scanner


fun main() {
    //Box obj
    //A:長23      寬14      高13 (cm)
    //B:長39.5    寬27.5    高23 (cm)
    val userInput = userInput()
    val userInputNum = Size(userInput[0], userInput[1], userInput[2])
    val regularSizeA = Size(23f, 14f, 13f)
    val regularSizeB = Size(39.5f, 27.5f, 23f)

//    userInputNum.reorder()

//    regularSizeA.reorder()
    val checkAPoint = regularSizeA.checkBox(userInputNum)

//    regularSizeB.reorder()
    val checkBPoint = regularSizeB.checkBox(userInputNum)

//    println("userInputList:$userInputList")
//    println("checkAList:$checkAReList")
//    println("checkBList:$checkBReList")
    println("checkAList:$checkAPoint")
    println("checkBList:$checkBPoint")
    println(checkBox(checkAPoint, checkBPoint))

}

fun checkBox(checkAPoint: Boolean, checkBPoint: Boolean): String {
    var systeminfo = ""
    if (checkAPoint && checkBPoint) {
        systeminfo = "兩個都能放，但放在A盒子,比較省錢!"
    } else if (!checkAPoint && !checkBPoint) {
        systeminfo = "沒有符合的盒子可以放"
    } else if (checkAPoint) {
        systeminfo = "放在A盒子"
    } else if (checkBPoint) {
        systeminfo = "放在B盒子"
    }
    return systeminfo
}

fun userInput(): MutableList<Float> {
//    val scanner = Scanner(System.`in`)
    print("請用空白鍵間隔輸入長、寬、高:")
//    val userInput = scanner.nextLine()

//    val userInputString: MutableList<String> = userInput.split(" ").toMutableList()
//    val userInputNum: MutableList<Float> = mutableListOf()
//    for (item in userInputString) {
//        userInputNum.add(item.toFloat())
//    }
    return Scanner(System.`in`)
        .nextLine().split(" ")
        .map { it.toFloat() }
        .toMutableList()
}

