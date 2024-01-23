package lottery

import inputToNum
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("請輸入總球數:")
    val lotteryBallInput: Int = scanner.nextInt()
    print("請輸入最後得球數:")
    val finalBallInput: Int = scanner.nextInt()
    scanner.nextLine()
    print("請輸入不要的數字:")
    val rejectInput: String = scanner.nextLine()
    print("請輸入一定要的數字:")
    val wantedInput: String = scanner.nextLine()
    val lottery = Lottery(lotteryBallInput, finalBallInput, rejectInput, wantedInput)

    lottery.randomNum()
}

class Lottery(
    private val lotteryBallInput: Int,
    private val finalBallInput: Int,
    //如果沒有在建構子以外的地方用到，就不需要使用var宣告
    rejectInput: String,
    wantedInput: String
) {
    private var rejectInputNum: List<Int>
    private var wantedInputInputNum: List<Int>

    init {
        rejectInputNum = inputToNum(rejectInput)
        println("這裡是《不要》的轉換:$rejectInputNum")
        wantedInputInputNum = inputToNum(wantedInput)
        println("這裡是《要》的轉換:$wantedInputInputNum")
    }


    fun randomNum(): List<Int> {
        var randomNum: Int
        var randomList: MutableList<Int> = mutableListOf()
        val finalList: MutableList<Int> = mutableListOf()
//        for (i in 1..lotteryBallInput) randomList.add(i)
        randomList = (1..lotteryBallInput).toList().toMutableList()
//        for (i in 1..lotteryBallInput) {
//            randomList.add(i)
//        }
        println("產生全部球數:$randomList")
        randomList.removeAll(this.rejectInputNum)
        println("刪除不要的號碼:$randomList")
        finalList.addAll(wantedInputInputNum)
        println("在結果先放入一定要的數字:$finalList")
        println("剩下幾個空格:${finalBallInput - finalList.size}")

        
        for (i in 1..(finalBallInput - finalList.size)) {
            randomNum = randomList.random()
            randomList.remove(randomNum)
            finalList.add(randomNum)
        }
        println("最後結果:${finalList}")
        return finalList
    }

}
