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
        ListNode<Integer> s = l, f = l;
        while(n > 0) {
            f = f.next;
            n--;
        }

        if(f != null) {
            while(f.next != null) {
                s = s.next;
                f = f.next;
            }
            f.next = l;
            l = s.next;
            s.next = null;
        }

        return l;
    }
}