package box

class Size(val height: Float, val width: Float, val length: Float) {
    // #1
    fun reorder(): MutableList<Float> {
        val boxSize: MutableList<Float> = mutableListOf(height, width, length)
        boxSize.sort()
        return boxSize
    }

    //#2 跟java依樣寫在判斷裡面(check)


    fun checkBox(userInput: MutableList<Float>, regularSize: MutableList<Float>): Int {

        var count: Int = 0;


//        println("裡面高度:${height},裡面寬度:${width},裡面長度:${length}")
//        println("AB高度:${regularSize.height},AB寬度:${regularSize.width},AB長度:${regularSize.length}")
//        println("輸入高度:${userInput.height},輸入寬度:${userInput.width},輸入長度:${userInput.length}")

        if (userInput[0] <= regularSize[0]) {
            count++
        }
        if (userInput[1]<= regularSize[1]) {
            count++
        }
        if (userInput[2] <= regularSize[2]) {
            count++
        }
        return count
    }
}

//class UserPackage(height: Float, width: Float, length: Float) : Size(height, width, length)
//class RegularSize(height: Float, width: Float, length: Float) : Size(height, width, length)


