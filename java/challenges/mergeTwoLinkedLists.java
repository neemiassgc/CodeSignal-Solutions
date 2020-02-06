final class MergeTwoLinkedLists {

 // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> append(ListNode<Integer> ln, int data) {
        if(ln == null) {
            ln = new ListNode(data);
            return ln;
        }
        ListNode<Integer> n = ln;
        while(n.next != null) { n = n.next; }
        n.next = new ListNode(data);
        return ln;
    }

    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ArrayList<Integer> list = new ArrayList();
        Integer[] nums = null;
        ListNode<Integer> out = null;
        while(l1 != null) { list.add(l1.value); l1 = l1.next; }
        while(l2 != null) { list.add(l2.value); l2 = l2.next; }
        nums = list.toArray(new Integer[list.size()]);
        Arrays.sort(nums);
        for(int i : nums) { out = append(out, i); }
        return out;
    }
}