fun reformat(s: String): String {

    val digits = mutableListOf<Char>()
    val letters = mutableListOf<Char>()

    s.forEach { char ->
        if (char.isDigit()) {
            digits.add(char)
        } else {
            letters.add(char)
        }
    }
    if (Math.abs(digits.size - letters.size) > 1 ) return ""

    val result = StringBuilder()
    var nextLetter = digits.size <= letters.size
    for (i in s.indices) {
        if (nextLetter) {
            result.append(letters.removeAt(0))
        } else {
            result.append(digits.removeAt(0))
        }
        nextLetter = !nextLetter
    }
    return result.toString()
}