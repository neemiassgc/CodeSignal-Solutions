final class mergeTwoLinkedLists {
	
	// Definition for singly-linked list:
	// class ListNode<T> {
	//   ListNode(T x) {
	//     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
	    if(l1 == null) return l2;
	    
	    if(l2 == null) return l1;
	    
	    if(l1.value < l2.value) {
	        l1.next = mergeTwoLinkedLists(l1.next, l2);
	        return l1;
	    }
	    
	    l2.next = mergeTwoLinkedLists(l1, l2.next);
	    return l2;
	}
}