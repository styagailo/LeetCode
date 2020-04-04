fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var j = 0
    var nums1Right = m
    while (nums1Right < nums1.size) {
        nums1[nums1Right] = nums2[j]
        nums1Right++
        j++
    }
    var k = m
    while (k < nums1.size) {
        var i = k
        while (i > 0 && nums1[i] <= nums1[i - 1]) {
            val mem = nums1[i - 1]
            nums1[i - 1] = nums1[i]
            nums1[i] = mem
            i--
        }
        k++
    }
}