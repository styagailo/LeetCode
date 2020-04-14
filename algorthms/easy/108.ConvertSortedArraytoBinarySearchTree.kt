fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return getTreeNode(0, nums.size - 1, nums)
}

fun getTreeNode(startIndex: Int, lastIndex: Int, nums: IntArray): TreeNode? {
    if (startIndex > lastIndex) return null
    
    val mid = (startIndex + lastIndex) / 2
    return TreeNode(nums[mid]).apply {
        left = getTreeNode(startIndex, mid - 1, nums)
        right = getTreeNode(mid + 1, lastIndex, nums)
    }
}