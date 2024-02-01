package box

import box.kotlin.RegularSize

class Tester {
}
fun main(){
    //Box obj
    //A:長23      寬14      高13 (cm)
    //B:長39.5    寬27.5    高23 (cm)

    val specifiedSizeA = RegularSize(23f,14f,13f)
    val specifiedSizeB = RegularSize(39.5f,27.5f,23f)
    println(specifiedSizeA)
    println(specifiedSizeB)
}