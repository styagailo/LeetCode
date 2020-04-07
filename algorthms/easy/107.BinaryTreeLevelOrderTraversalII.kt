fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()
    
    val resultList = mutableListOf<List<Int>>()
    var subList = mutableListOf<Int>()
    val queue = mutableListOf<TreeNode>()
    queue.add(root)
    var i = 0
    
    while (i == 0) {
        var count = queue.size
        if (count == 0) break
        
        while (count > 0) {
            val currentNode = queue.removeAt(0)
            subList.add(currentNode.`val`)
            
            if (currentNode.left != null) {
                queue.add(currentNode.left)
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right)
            }
            count--
        }
        resultList.add(0, subList)
        subList = mutableListOf<Int>()
    }
    
    return resultList
}