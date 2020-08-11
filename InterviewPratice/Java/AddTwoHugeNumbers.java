final class addTwoHugeNumbers {
    
    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> out = new ListNode<Integer>(0), ref = out;
        int d = 0;
        
        a = reverse(a);
        b = reverse(b);
        
        while(a != null || b != null){
            
            if(a != null){
                d += a.value;
                a = a.next;
            }
            
            if(b != null){
                d += b.value;
                b = b.next;
            }
            
            ref.next = new ListNode<Integer>(d % 10000);
            ref = ref.next;
            d = d / 10000;
        }
        
        if(d >= 1) ref.next= new ListNode<Integer>(d);
        
        return reverse(out.next);
    }

    ListNode<Integer> reverse(ListNode<Integer> l){
        ListNode<Integer> rev = null;
        
        for(; l != null; l = l.next) {
            ListNode<Integer> head = new ListNode<>(l.value);
            head.next = rev;
            rev = head;
        }
        
        return rev;
    }
}