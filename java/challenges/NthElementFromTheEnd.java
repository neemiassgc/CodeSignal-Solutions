public final class NthElementFromTheEnd {

//Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//     ListNode(T x) {
//       value = x;
//     }
//     T value;
//     ListNode<T> next;
// }
int nthElementFromTheEnd(ListNode<Integer> l, int n) {
        ArrayList<Integer> out = new ArrayList();
        ListNode<Integer> ln = l;
        while(ln != null) {
            out.add(ln.value);
            ln = ln.next;
        }
        return (n > out.size()) ? -1 : out.get(out.size() - n);
    }
}