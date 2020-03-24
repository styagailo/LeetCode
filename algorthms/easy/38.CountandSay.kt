fun countAndSay(n: Int): String {
    if (n == 1) return "1"
    var previous = countAndSay(n - 1)
    val result = StringBuilder()
    var i = 0
    while (i < previous.length) {
        val currentChar = previous[i]
        var j = i + 1

        while (j < previous.length && previous[j] == currentChar) {
            j++
        }

        val newChar = (j - i).toString()
        result.append(newChar)
        result.append(currentChar)

        i += j - i
    }

    return result.toString()
}

