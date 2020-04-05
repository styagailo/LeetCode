fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
        when {
            p == null && q == null -> true
            p == null && q != null -> false
            q == null && p != null -> false
            p!!.`val` != q!!.`val` -> false
            else -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }