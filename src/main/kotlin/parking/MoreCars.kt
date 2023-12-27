package parking

import java.time.Duration
import java.time.LocalDateTime

fun main (){
    val parkingLot = HashMap<String,MoreCars>()
    val enterTime:LocalDateTime = LocalDateTime.of(2023,12,25,8,0,0)
    var car:MoreCars? = null
    //第一台車
    car = MoreCars("AA-0001",enterTime)
    parkingLot.put(car.carNum,car)
    //第二台車
    car = MoreCars("BB-0001",enterTime.plusMinutes(15))
    parkingLot.put(car.carNum,car)
    //讓第一台車出場
    var leaveTime:LocalDateTime = LocalDateTime.of(2023,12,25,10,40,0)
    car = parkingLot.get("AA-0001")

    var carAMin=car!!.parkingDurationMin(enterTime,leaveTime).toFloat()
    var carTotal =car.total(carAMin)
    println("${car.carNum} carA'time:$carAMin price:$carTotal")





}

class MoreCars(val carNum:String,val enterTime:LocalDateTime) {
    var leaveTime:LocalDateTime? = null
    var perHourPrice:Int = 30

    fun parkingDurationMin(enterTime: LocalDateTime,leaveTime:LocalDateTime) = Duration.between(enterTime,leaveTime).toMinutes()
    fun total(carAMin:Float) =Math.round(carAMin/60f)*perHourPrice





}
