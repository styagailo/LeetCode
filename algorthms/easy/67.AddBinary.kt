fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var translate = false
    var result = StringBuilder()
    while (i >= 0 || j >= 0) {
        val firstNumber = if (i >= 0) Character.getNumericValue(a[i]) else 0
        val secondNumber = if (j >= 0) Character.getNumericValue(b[j]) else 0
        val thirdNumber = if (translate) {
            1
        } else {
            0
        }
        val sum: Int = firstNumber + secondNumber + thirdNumber
        when {
            sum == 0 -> {
                result.insert(0, "0")
                translate = false
            }
            sum == 1 -> {
                result.insert(0, "1")
                translate = false
            }
            sum == 2 -> {
                result.insert(0, "0")
                translate = true
            }
            sum == 3 -> {
                result.insert(0, "1")
                translate = true
            }
        }
        i--
        j--
    }
    
    if (translate) result.insert(0, "1")
    
    return result.toString()
}