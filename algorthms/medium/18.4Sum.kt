fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    nums.sort()
    
    val resultMatrix = mutableListOf<List<Int>>()
    var i = 0
    while (i < nums.size - 3) {
        if (i != 0 && nums[i] == nums[i - 1]) {
            i++
            continue
        }
        var j = i + 1
        while (j < nums.size - 2) {
            if (j != i + 1 && nums[j] == nums[j - 1]) {
                j++
                continue
            }
            var k = j + 1
            var m = nums.size - 1
            val remain = target - (nums[i] + nums[j])
            while (k < m) {
                val sum = nums[m] + nums[k]
                if (sum == remain) {
                    resultMatrix.add(listOf(nums[i], nums[j], nums[k], nums[m]))
                    k++
                    m--
                    while (k < m && nums[k] == nums[k - 1]) k++
                    while (k < m && nums[m] == nums[m + 1]) m--
                } else if (sum < remain) {
                    k++
                } else {
                    m--
                }
            }
            j++
        }
        i++
    }
    return resultMatrix
}