class Solution {
    private var result = true
    fun isBalanced(root: TreeNode?): Boolean {
        getHeight(root)
        return result
    }
    
    fun getHeight(node: TreeNode?): Int {
        if (node == null) return 0
        
        val left = getHeight(node.left)
        val right = getHeight(node.right)
        if (Math.abs(left - right) > 1) result = false
        val max = if (left > right) left else right
        return max + 1
    }
}