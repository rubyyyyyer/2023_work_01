package train.station

import java.util.Scanner

class Ticketing(var oneWayPrice: Int, var discount: Float, var totalTicketsNum: Int, var roundTripNum: Int) {
    fun count(): Int {
        val count = ((totalTicketsNum - roundTripNum) * oneWayPrice) + (roundTripNum * 2 * oneWayPrice * discount)
        println("有幾張單程票?${totalTicketsNum - roundTripNum}")
        println(
            "單程票總費用:${(totalTicketsNum - roundTripNum) * oneWayPrice}，雙程票總費用:${
                (roundTripNum * 2 * oneWayPrice * discount).toInt()
            }，加總:${count.toInt()}，共${totalTicketsNum}張票"
        )
        return count.toInt()
    }

}

fun main() {
    var oneWayPrice = 1000
    var discount = 0.8f
    val scanner = Scanner(System.`in`)
    var bookingAgain = 0

    while(bookingAgain!=-1){
    print("總共要買幾張車票?")
    val totalTickets = scanner.nextInt()
    print("有幾張來回票?")
    val roundTripNum = scanner.nextInt()
        if(totalTickets-roundTripNum>=0){
    Ticketing(oneWayPrice, discount, totalTickets, roundTripNum).count()
    print("需要繼續使用本系統嗎?請輸入「任意數字」繼續或輸入「-1」離開本系統:")
    bookingAgain = scanner.nextInt()
    print((if (bookingAgain==-1)"謝謝惠顧，歡迎下次光臨~" else "歡迎您繼續使用本系統，"))
        }else{
            println("輸入的數量有誤，請重新輸入。")
        }
    }
}