fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.size == 0) return 0
        var i = 0
        while (i < nums.size && target > nums[i]) {
            i++
        }
        return i
    }