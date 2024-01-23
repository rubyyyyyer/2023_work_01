fun inputToNum(input: String): MutableList<Int> =
    input.split(" ").map { it.toInt() }.toMutableList()