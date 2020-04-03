fun deleteDuplicates(head: ListNode?): ListNode? {
    var currentHead = head as? ListNode ?: return null
    while (currentHead.next != null && currentHead.`val` ==  currentHead.next.`val`) {
            currentHead = currentHead.next
        }
    
    head.next = deleteDuplicates(currentHead.next)
    
    return head
}