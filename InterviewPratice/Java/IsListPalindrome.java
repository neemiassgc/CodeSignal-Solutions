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
    
    boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> curr = l, prev = reverse(l);

        while(curr != null && prev != null) {
            if(curr.value != prev.value) {
                return false;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return true;
    }
     //Alternative
    boolean checkPalindrome(String inputString) {
        return new StringBuilder(inputString).reverse().toString().equals(inputString);
    }
   
}
