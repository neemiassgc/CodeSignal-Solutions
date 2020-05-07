public final class ReverseLinkedList {
    
    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //
    
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

    ListNode<Integer> reverseLinkedList(ListNode<Integer> l) {
        ListNode<Integer> out = reverse(l);
        return out;
    }
}