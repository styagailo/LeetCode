fun mergeTwoListsRecursively(l1: ListNode?, l2: ListNode?): ListNode? {
        when {
            l1 == null && l2 == null -> return null
            l1 == null -> return l2
            l2 == null -> return l1
        }
        
        if (l1 == null) throw RuntimeException()
        if (l2 == null) throw RuntimeException()
        
        return when {
            l1.`val` > l2.`val` -> {
                ListNode(l2.`val`).apply { next = mergeTwoLists(l1, l2.next) }
            }
            else -> {
                ListNode(l1.`val`).apply { next = mergeTwoLists(l1.next, l2) }
            }
        }
    }

fun mergeTwoLists(left: ListNode?, right: ListNode?): ListNode? {
    if (left == null && right == null) return null

    var l1 = left
    var l2 = right
    var headNode = ListNode(0)
    var resultNode = headNode

    while(l1 != null && l2 != null) {
        when {
            l1.`val` > l2.`val` -> {
                headNode.`val` = l2.`val`
                l2 = l2.next
            }
            else -> {
                headNode.`val` = l1.`val`
                l1 = l1.next
            }
        }
        if (l1 != null || l2 != null) {
            headNode.next = ListNode(0)
            headNode = headNode.next
        }
    }

    while (l1 != null) {
        headNode.`val` = l1.`val`
        l1 = l1.next

        if (l1 != null) {
            headNode.next = ListNode(0)
            headNode = headNode.next
        }
    }

    while (l2 != null) {
        headNode.`val` = l2.`val`
        l2 = l2.next

        if (l2 != null) {
            headNode.next = ListNode(0)
            headNode = headNode.next
        }
    }

    return resultNode
}

