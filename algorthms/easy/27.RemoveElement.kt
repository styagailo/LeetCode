fun removeElement(nums: IntArray, `val`: Int): Int {
    var sizeOfArrayWithoutVal = 0
    for (currentNumIndex in 0 until nums.size) {
        if (nums[currentNumIndex] != `val`) {
            sizeOfArrayWithoutVal++
            continue
        }
        var indexOfVal = currentNumIndex
        while (indexOfVal < nums.size - 1 && nums[indexOfVal] == nums[indexOfVal + 1]) {
            indexOfVal++
        }
    
        if (indexOfVal >= nums.size - 1) break

        nums[currentNumIndex] = nums[indexOfVal + 1]
        nums[indexOfVal + 1] = `val`
        sizeOfArrayWithoutVal++
    }

    return sizeOfArrayWithoutVal
}

fun removeElementImproved(nums: IntArray, `val`: Int): Int {
    var i = 0
    for (j in 0 until nums.size) {
        if (nums[j] != `val`) {
            i++
            nums[i] = nums[j]
        }
    }
    return i
}