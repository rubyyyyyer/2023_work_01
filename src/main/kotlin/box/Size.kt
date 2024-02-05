package box

class Size(val height: Float, val width: Float, val length: Float) {
    // #1
    private var boxSize: MutableList<Float> = mutableListOf()

    init {
        reorder()
    }

    private fun reorder() {
        boxSize = mutableListOf(height, width, length)
        boxSize.sort()
    }

    //#2 跟java依樣寫在判斷裡面(check)












    fun checkBox(userInput: Size): Boolean {

//        var count: Int = 0;

        val transform: (Int, Float) -> Boolean = {
            index, it -> userInput.boxSize[index] <= it
        }
        val result = boxSize.mapIndexed( transform )
        return boxSize.mapIndexed { index, it -> userInput.boxSize[index] <= it }.all { it }
//        println(test)
//        println("裡面高度:${height},裡面寬度:${width},裡面長度:${length}")
//        println("AB高度:${regularSize.height},AB寬度:${regularSize.width},AB長度:${regularSize.length}")
//        println("輸入高度:${userInput.height},輸入寬度:${userInput.width},輸入長度:${userInput.length}")

//        if (userInput.boxSize[0] <= boxSize[0]) {
//            count++
//        }
//        if (userInput.boxSize[1]<= boxSize[1]) {
//            count++
//        }
//        if (userInput.boxSize[2] <= boxSize[2]) {
//            count++
//        }
//        return count
    }
}

//class UserPackage(height: Float, width: Float, length: Float) : Size(height, width, length)
//class RegularSize(height: Float, width: Float, length: Float) : Size(height, width, length)


