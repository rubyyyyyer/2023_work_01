package parking.kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2023, 12, 25, 20, 0, 0)
    val leave = LocalDateTime.of(2023, 12, 25, 22, 10, 0)
    var perHouePrice:Int= 30
    var car = Car("AA-0001", enter)
    car.leave = leave
    var durationHr:Int = Math.round(car.durationMin() / 60f)
    println(car.total(durationHr,perHouePrice))

}


class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }

    fun durationMin(): Long = Duration.between(enter, leave).toMinutes()
    fun total(durationHr: Int, perHouePrice: Int):Int {
        return durationHr*perHouePrice

    }
}

