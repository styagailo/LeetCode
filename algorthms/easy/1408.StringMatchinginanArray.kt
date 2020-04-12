fun stringMatching(words: Array<String>): List<String> {
    val hashMap = mutableMapOf<String, Boolean>()
    
    words.forEach { word ->
        if (!hashMap.containsKey(word)) hashMap.put(word, false)
    }
    
    var wordPointer = 0
    while (wordPointer < words.size) {
        val word = words[wordPointer]
        var isSubstring = false
        val remainedWords = words.filter { it != word }
        
        remainedWords.forEach { remainedWord ->
            var remainedPointer = 0
            var currentWordPointer = 0
            while (remainedPointer < remainedWord.length) {
                if (remainedWord[remainedPointer] == word[currentWordPointer]) {
                    currentWordPointer++
                } else if (currentWordPointer > 0) {
                    currentWordPointer = 0
                    remainedPointer--
                }
                
                remainedPointer++
                
                if (currentWordPointer == word.length) {
                    hashMap[word] = true
                    return@forEach
                }
            }
        }
        
        wordPointer++
    }
    
    return hashMap.filterValues { it == true }.keys.toList()
}