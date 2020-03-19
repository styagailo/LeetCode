fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 1) return 1
        var acc = 0
        for (i in 1 until nums.size) {
            when {
                nums[i] == nums[i - 1] -> {
                    acc++
                }
                nums[i] != nums[i - 1] && acc != 0 -> {
                    nums[i - acc] = nums[i]
                }
            }
        }
        
        var result = 1
        while (result < nums.size && nums[result - 1] < nums[result]) {
            result++
        }
        return result
}

fun removeDuplicatesImproved(nums: IntArray): Int {
    if (nums.size == 0) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[i] != nums[j]) {
            i++
            nums[i] = nums[j]
        }
    }

    return i + 1
}