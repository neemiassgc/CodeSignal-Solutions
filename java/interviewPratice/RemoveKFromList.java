public final class RemoveKFromList {
 
    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> out = new ListNode<>(null);
        out.next = l;

        ListNode<Integer> curr = l, prev = out;
        for(; curr != null; ) {
            if(curr.value == k) {
                prev.next = curr.next;
                curr = curr.next;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }

        return out.next;
    }
}    