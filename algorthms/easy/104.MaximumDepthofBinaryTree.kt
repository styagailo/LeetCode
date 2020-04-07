fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    
    val left = 1 + maxDepth(root.left)
    val right = 1 + maxDepth(root.right)
    
    return if (left > right) left else right
}