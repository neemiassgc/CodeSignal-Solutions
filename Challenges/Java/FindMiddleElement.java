final class FindMiddleElement {
	
	// Singly-linked lists are already defined with this interface:
	// class ListNode<T> {
	//   ListNode(T x) {
	//     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//

	int findMiddleElement(ListNode<Integer> l) {
	    int counter = 0;
	    
	    for(ListNode<Integer> ref = l; ref != null; ref = ref.next) counter++;
	    
	    for(int i = 0; l != null && i < counter / 2; l = l.next, i++);
	    
	    return l.value;
	}
}