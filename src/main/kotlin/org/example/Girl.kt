package org.example

class Girl(var weight:Float,var height:Float) {
    var name :String = ""
    init {
        println("我有進來這裡!")
    }
constructor(name:String,weight: Float,height: Float):this(weight, height){
    this.name = name;
println("顯示我的名字" + name)
}
    fun bmi():Float{
        val bmi = weight/(height*height)
        return  bmi
    }
    fun hello(){
        println("Kotlin 你好!(我記著了!)")
    }

}