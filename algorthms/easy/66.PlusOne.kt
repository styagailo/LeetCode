fun plusOne(digits: IntArray): IntArray {
        var index = digits.size - 1

        if (digits[index] != 9) {
            digits[index]++
        } else {
            while (index >= 0) {
                when {
                    index == 0 && digits[index] == 9 -> {
                        return IntArray(digits.size + 1) { index -> 
                            if (index == 0) {
                                 1
                            } else {
                                0
                            }
                        }
                    }
                    digits[index] == 9 -> {
                        digits[index] = 0
                        index--
                    }
                    else -> {
                        digits[index]++
                        return digits
                    }
                    
                }
            }
        }
        return digits
    }