final class IsListPalindrome {

   // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //

    boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> rev = new ListNode<>(null), ref = l;
        
        for(; ref != null; ref = ref.next) {
            ListNode<Integer> tmp = new ListNode<>(ref.value);
            tmp.next = rev;
            rev = tmp;
        }
        
        for(; l != null && rev != null; l = l.next, rev = rev.next)
            if(!l.value.equals(rev.value)) return false;
        
        return true;
    }
}
