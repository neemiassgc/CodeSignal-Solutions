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
	
	ListNode<Integer> append(ListNode<Integer> l, int data) {
	    if(l == null) {
	        l = new ListNode<>(data);
	        return l;
	    }
	    ListNode<Integer> head = l;
	    while(head.next != null) {
	        head = head.next;
	    }
	    head.next = new ListNode<>(data);
	    return l;
	}

	ListNode<Integer> reverse(ListNode<Integer> l) {
	    ListNode<Integer> previous = null, current = l, next = null;
	    while(current != null) {
	        next = current.next;
	        current.next = previous;
	        previous = current;
	        current = next;
	    }
	    return l = previous;
	}

	ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
	    ListNode<Integer> out = null, carry = null;
	    int c = 0;
	    
	    for(; l != null; l = l.next) {
	        if(c < k) {
	            carry = append(carry, l.value);
	            c++;

	            if(c == k) {        
	                carry = reverse(carry);
	                while(carry != null) {
	                    out = append(out, carry.value);
	                    carry = carry.next;
	                }
	                carry = null;
	                c = 0;
	            }    
	        }
	    }
	    if(c > 0) {
	        while(carry != null) {
	            out = append(out, carry.value);
	            carry = carry.next;
	        }
	    }
	    return out;
	}
}