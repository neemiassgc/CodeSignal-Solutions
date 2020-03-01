final class mergeTwoLinkedLists {
	
	// Singly-linked lists are already defined with this interface:
	// class ListNode<T> {
	//   ListNode(T x) {
	//     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	
	ListNode<Integer> add(ListNode<Integer> l, int data) {
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

	ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
	    ListNode<Integer> out = null;
	    ArrayList<Integer> al = new ArrayList<>();
	    Integer[] sorted = null;
	    
	    while(l1 != null) {
	        al.add(l1.value);
	        l1 = l1.next;
	    }
	    while(l2 != null) {
	        al.add(l2.value);
	        l2 = l2.next;
	    }

	    sorted = al.toArray(new Integer[al.size()]);
	    Arrays.sort(sorted);
	    for(int i = 0; i < sorted.length; i++) {
	        out = add(out, sorted[i]);
	    }
	    return out;
	}
}