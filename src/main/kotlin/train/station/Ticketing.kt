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
    print("總共要買幾張車票?")
    val totalTickets = scanner.nextInt()
    print("有幾張來回票?")
    val roundTripNum = scanner.nextInt()
    Ticketing(oneWayPrice, discount, totalTickets, roundTripNum).count()

}