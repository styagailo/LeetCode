fun strStr(haystack: String, needle: String): Int {
        
        if (needle.isNullOrBlank()) return 0
        if (haystack.length < needle.length) return -1

        if (haystack.length == needle.length) {
            return if (haystack == needle) 0 else -1
        }

        for (i in 0 until haystack.length - needle.length + 1) {
            var temp = i

            var j = 0
            while (j < needle.length && haystack[temp] == needle[j]) {
                temp++

                if (j == needle.length - 1) return i
                j++
            }
        }

        var firstOccurence = -1

        return -1
    }