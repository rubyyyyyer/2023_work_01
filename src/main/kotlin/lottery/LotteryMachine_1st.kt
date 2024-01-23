package lottery.first

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("請輸入總球數:")
    val lotteryBallInput: Int = scanner.nextInt()
    print("請輸入最後得球數:")
    val finalBallInput: Int = scanner.nextInt()
    scanner.nextLine()
    print("請輸入不要的數字:")
    var rejectInput: String = scanner.nextLine()
    print("請輸入一定要的數字:")
    var wantedInput: String = scanner.nextLine()
    val lottery = Lottery(lotteryBallInput, finalBallInput, rejectInput, wantedInput)

    val rejectInputNum = lottery.inputToNum(rejectInput)
    println("這裡是《不要》的轉換:$rejectInputNum")

    val wantedInputInputNum = lottery.inputToNum(wantedInput)
    println("這裡是《要》的轉換:$wantedInputInputNum")
    lottery.randomNum(lotteryBallInput, finalBallInput, rejectInputNum, wantedInputInputNum)
}

class Lottery(
    val lotteryBallInput: Int,
    val finalBallInput: Int,
    var rejectInput: String,
    var wantedInput: String
) {

    var InputIntList: MutableList<Int> = mutableListOf()


    fun inputToNum(input: String): MutableList<Int> {
        var inputStringList: MutableList<String> = input.split(" ").toMutableList()
//        var rejectInputIntList: MutableList<Int> = mutableListOf()

//        使用原本for回圈的方法
//        for (i in 1..rejectInputStringList.size) {
//            var rejectInputToNum: Int = rejectInputStringList.get(i).toInt()
//            rejectInputIntList.add(rejectInputToNum)
//            println(rejectInputIntList)
//        }
//        是一种用于检查集合成员关系的语法。它检查变量 i 是否是集合 rejectInputStringList 中的一个元素。
//        for (i in rejectInputStringList) {
//            var rejectInputToNum: Int =i.toInt()
//            rejectInputIntList.add(rejectInputToNum)
//            println(rejectInputIntList)
//        }
//      map 是集合的一个高阶函数，它用于对集合的每个元素进行转换并生成一个新的集合。
        InputIntList = inputStringList.map { it.toInt() }.toMutableList()

        return InputIntList
    }

    fun randomNum(
        lotteryBallInput: Int,
        finalBallInput: Int,
        rejectInput: MutableList<Int>,
        wantedInput: MutableList<Int>
    ): MutableList<Int> {
        var randomNum: Int
        val random = Random(finalBallInput)
        var randomList: MutableList<Int> = mutableListOf()
        var finalList: MutableList<Int> = mutableListOf()
        for (i in 1..lotteryBallInput) {
            randomList.add(i)
        }
        println("產生全部球數:$randomList")
        randomList.removeAll(rejectInput)
        println("刪除不要的號碼:$randomList")
        finalList.addAll(wantedInput)
        println("在結果先放入一定要的數字:$finalList")
        println("剩下幾個空格:${finalBallInput - finalList.size}")
        for (i in 1..(finalBallInput - finalList.size)) {
            randomNum = randomList.random()
//            println("亂數出來的數字:$randomNum")
            randomList.remove(randomNum)
            finalList.add(randomNum)
        }
        println("最後結果:${finalList}")
        return finalList
    }

}
