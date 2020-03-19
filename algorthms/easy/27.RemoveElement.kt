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

/*
Examples
[0, 1, 1] value 1
[1, 1, 1] value 1
[2, 2, 2] value 2
[0, 1, 2, 3, 3, 3, 2] value 3
 */