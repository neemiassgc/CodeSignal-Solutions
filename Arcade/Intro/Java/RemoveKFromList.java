final class RemoveKFromList {
	
	// Singly-linked lists are already defined with this interface:
	// class ListNode<T> {
	//   ListNode(T x) {
	//     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
	    ListNode<Integer> out = new ListNode<>(null), ref = out;
	    
	    for(; l != null; l = l.next) {
	        if(l.value != k) {
	            ref.next = new ListNode<>(l.value);
	            ref = ref.next;
	        }
	    }
	    
	    return out.next;
	}
}