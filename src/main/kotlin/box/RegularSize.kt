package box.kotlin

class RegularSize(val height:Float, val width:Float, val length:Float) {
    fun reorder(){
        var specifiedSize:MutableList<Float> = mutableListOf(height,width,length)
        println(specifiedSize.sort())

    }

}
