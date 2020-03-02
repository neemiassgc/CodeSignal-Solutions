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
        ListNode<Integer> result = new ListNode<Integer>(0);
        ListNode<Integer> head = result;
        int carry = 0;
        a = reverse(a);
        b = reverse(b); 
        while(a != null || b != null){
            if(a != null){
                carry += a.value;
                a = a.next;
            }
            if(b != null){
                carry += b.value;
                b = b.next;
            }
            head.next = new ListNode<Integer>(carry % 10000);
            head = head.next;
            carry = carry / 10000;
        }
        if(carry >= 1)
            head.next= new ListNode<Integer>(carry);
        
        return reverse(result.next);
    }

    ListNode<Integer> reverse(ListNode<Integer> head){
        ListNode<Integer> prev = null;
        while(head != null){
            ListNode<Integer> temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}