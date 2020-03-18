fun main(args: Array<String>) {

    val array = IntArray(5, { integer -> integer + 2})

    println(removeDuplicates(array))
    array.forEach { print(it) }
}

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