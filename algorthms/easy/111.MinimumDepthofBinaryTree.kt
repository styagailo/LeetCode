fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0
    
    val left = minDepth(root.left)
    val right = minDepth(root.right)
    
    return if (left != 0 && right != 0) {
        Math.min(left, right) + 1
    } else {
        Math.max(left, right) + 1
    } 
}