import java.util.Vector;

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
	    Vector<Integer> vec = new Vector<>();
    
	    for(; l != null; l = l.next) vec.add(l.value);
	    
	    int[] items = vec.stream().mapToInt(n -> n).toArray();
	    
	    for(int right = 0, left = items.length - 1; left >= 0; right++, left--)
	        if(items[right] != items[left]) return false;
	    
	    return true;
	}
}