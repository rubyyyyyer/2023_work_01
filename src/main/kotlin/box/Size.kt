package box

open class Size(val height: Float, val width: Float, val length: Float) {
    var boxSize: MutableList<Float> = mutableListOf()
    open fun reorder(): MutableList<Float> {
        boxSize = mutableListOf(height, width, length)
        boxSize.sort()
        return boxSize
    }

    fun checkBox(userInput: Size, regularSize: Size): Int {

        var count: Int = 0;

//        println("裡面高度:${height},裡面寬度:${width},裡面長度:${length}")
//        println("AB高度:${regularSize.height},AB寬度:${regularSize.width},AB長度:${regularSize.length}")
//        println("輸入高度:${userInput.height},輸入寬度:${userInput.width},輸入長度:${userInput.length}")

        if (userInput.height <= regularSize.height) {
            count++
        }
        if (userInput.width <= regularSize.width) {
            count++
        }
        if (userInput.length <= regularSize.length) {
            count++
        }
        return count
    }
}

//class UserPackage(height: Float, width: Float, length: Float) : Size(height, width, length)
//class RegularSize(height: Float, width: Float, length: Float) : Size(height, width, length)


