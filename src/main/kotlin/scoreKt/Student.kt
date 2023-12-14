package scoreKt

class Student(var name: String, var id: String, var eng: Int, var math: Int) {
    fun showScore() {
        println(
            "$name($id) \t 英文:$eng \t 數學:$math \t 平均:" +
                    ((math + eng) / 2)
        )
    }
    fun highest(){
        
    }
}