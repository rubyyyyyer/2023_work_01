package scoreKt

class Student(var name: String, var id: String, var eng: Int, var math: Int) {
    fun showScore() {
        println(
            "$name($id) \t 英文:$eng \t 數學:$math \t 平均:${getAverage()} \t ${passOrFailed()} \t 最高成績: ${highest()} \t 等級:${grading()}"
        )
//        if (getAverage()>=60){
//            println("KotlinPASS!")
//        }else{
//            println("KotlinFAILED!")
//        }
    }

    fun getAverage(): Int {
        return ((math + eng) / 2)
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    fun passOrFailed()=if (getAverage() >= 60) "PASS" else "FAILED"
    fun highest(): Int {
//        var max = if (eng > math) eng else math
        /*        var max = if (eng > math) {
                    println("英文比較好")
                    eng
                } else {
                    println("數學比較好")
                    math
                }*/

        return if (eng > math) {
            println("英文比較好")
            eng
        } else {
            println("數學比較好")
            math
        }
    }
}