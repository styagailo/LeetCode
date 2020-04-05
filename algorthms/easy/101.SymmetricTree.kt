fun isSymmetric(root: TreeNode?): Boolean {
    return isSymmetric(root?.left, root?.right)
}

fun isSymmetric(rootLeft: TreeNode?, rootRight: TreeNode?): Boolean =
    when {
        rootLeft == null && rootRight == null -> true
        rootLeft == null || rootRight == null -> false
        rootLeft.`val` != rootRight.`val` -> false
        else -> isSymmetric(rootLeft.left, rootRight.right) && isSymmetric(rootLeft.right, rootRight.left)
    }