final class ReverseNodeInKGroups {

	// Singly-linked lists are already defined with this interface:
	// class ListNode<T> {
	//   ListNode(T x) {
	//     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	ListNode<Integer> reverse(ListNode<Integer> l){
	    ListNode<Integer> rev = null;
	    
	    for(; l != null; l = l.next) {
	        ListNode<Integer> head = new ListNode<>(l.value);
	        head.next = rev;
	        rev = head;
	    }
	    
	    return rev;
	}

	ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
	    ListNode<Integer> out = new ListNode<>(null),
	    carry = new ListNode<>(null), ref = out, aux = carry;
	    int i = 1;
	    
	    for(; l != null; l = l.next, i++) {
	        aux.next = new ListNode<>(l.value);
	        aux = aux.next;
	        
	        if(i % k == 0) {
	            ref.next = reverse(carry.next);
	            for(; ref.next != null; ref = ref.next);
	            
	            carry = new ListNode<>(l.value);
	            aux = carry;
	        }
	    }

	    ref.next = carry.next;
	    
	    return out.next;
	}
}