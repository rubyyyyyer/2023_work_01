package scoreKt

class GraduateStudent(name: String, id: String, eng: Int, math: Int, var thesis: Int) : Student(name,id,eng,math) {
    companion object {
        var pass = 75;
    }

    override fun showScore() {
        println(
                "$name($id) \t 英文:$eng \t 數學:$math \t 論文:$thesis \t 平均:${getAverage()} \t ${passOrFailed()} \t 最高成績: ${highest()} \t 等級:${grading()}"
        )
    }

    override fun getAverage(): Int {
        return ((math + eng + thesis) / 3)
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"




    override fun highest(): Int {
        var max:Int
        if (eng > math){
            max = eng
            if (thesis>max){
                max=thesis
            }
        }else{
            max = math
            if (thesis>max){
                max=thesis
            }
        }
        return max
    }

}

open class Student(var name: String, var id: String, var eng: Int, var math: Int) {
    companion object {
        var pass = 60
    }

   open fun showScore() {
        println(
                "$name($id) \t\t 英文:$eng \t 數學:$math \t\t\t\t 平均:${getAverage()} \t ${passOrFailed()} \t 最高成績: ${highest()} \t 等級:${grading()}"
        )
//        if (getAverage()>=60){
//            println("KotlinPASS!")
//        }else{
//            println("KotlinFAILED!")
//        }
    }

    open fun getAverage(): Int {
        return ((math + eng) / 2)
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
    open fun highest(): Int {
//        var max = if (eng > math) eng else math
        /*        var max = if (eng > math) {
                    println("英文比較好")
                    eng
                } else {
                    println("數學比較好")
                    math
                }*/

        return if (eng > math) {
//            print("英文比較好\t")
            eng
        } else {
//            print("數學比較好\t")
            math
        }
    }
}