fun lengthOfLastWord(s: String): Int {
        if (s.length == 0) return 0

        var maxLength = 0
        var endIndex = s.length - 1

        while (endIndex >= 0 && s[endIndex] == ' ') {
            endIndex--
        }

        var startIndex = endIndex

        while (startIndex >= 0 && s[startIndex] != ' ') {
            startIndex--
        }

        return (endIndex - startIndex)
    }