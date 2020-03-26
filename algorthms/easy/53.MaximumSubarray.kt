fun maxSubArray(nums: IntArray): Int {

    var max = Integer.MIN_VALUE

    for (i in 0 until nums.size) {
        var sum = nums[i]
        max = Math.max(max, sum)
        for (j in i + 1 until nums.size) {
            sum += nums[j]
            max = Math.max(max, sum)
        }
    }

    return max
}