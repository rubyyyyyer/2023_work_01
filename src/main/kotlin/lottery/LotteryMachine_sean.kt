package lottery.sean

import inputToNum
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
    lottery.randomNum()
}

class Lottery(
    private val lotteryBallInput: Int,
    private val finalBallInput: Int,
    rejectInput: String,
    wantedInput: String
) {
    private var wantedInputInputNum: MutableList<Int>
    private var rejectInputNum: MutableList<Int>

    init {
        this.rejectInputNum=inputToNum(rejectInput)
        println("這裡是《不要》的轉換:$rejectInputNum")

        this.wantedInputInputNum = inputToNum(wantedInput)
        println("這裡是《要》的轉換:$wantedInputInputNum")
    }

    fun randomNum(): MutableList<Int> {
        var randomNum: Int
//        val random = Random(finalBallInput)
        var randomList: MutableList<Int> = mutableListOf()
        var finalList: MutableList<Int> = mutableListOf()

        //某部分改成list不要都用MutableList
        //簡單方法for
        for (i in 1..lotteryBallInput) {

            randomList.add(i)
        }
        println("產生全部球數:$randomList")
        randomList.removeAll(rejectInputNum)
        println("刪除不要的號碼:$randomList")
        finalList.addAll(wantedInputInputNum)
        println("在結果先放入一定要的數字:$finalList")
        println("剩下幾個空格:${finalBallInput - finalList.size}")

        //簡單方法for，可能有類似方法
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

