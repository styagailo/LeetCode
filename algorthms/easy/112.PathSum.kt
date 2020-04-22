fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
    when {
        root == null -> return false
        root.left == null && root.right == null -> return sum == root.`val`
    }
    
    val remain = sum - root!!.`val`
    return hasPathSum(root.left, remain) || hasPathSum(root.right, remain)
}