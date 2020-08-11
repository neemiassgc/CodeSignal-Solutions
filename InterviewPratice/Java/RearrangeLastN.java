final class RearrangeLastN {

    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //

    ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        if(l == null) return l;
        
        int size = 1;
        ListNode<Integer> r = l, a = new ListNode<>(null),
        b = new ListNode<>(null), ra = a, rb = b;
        
        for(; r != null; r = r.next, size++);
        
        r = l;
        for(int i = 1; r != null; r = r.next, i++) {
            if(i < size - n) ra = ra.next = new ListNode<>(r.value);
            else rb = rb.next = new ListNode<>(r.value);
        }
        
        for(rb = b, ra = a; rb.next != null; rb = rb.next);
        
        rb.next = ra.next;
        
        return b.next;
    }

}