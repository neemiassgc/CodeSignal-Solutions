// Singly-linked lists are already defined with this interface:
// function ListNode(x) {
//   this.value = x;
//   this.next = null;
// }
//
function mergeTwoLinkedLists(l1, l2) {
    if(l1 == null) return l2;
    
    if(l2 == null) return l1;
    
    if(l1.value < l2.value) {
        l1.next = mergeTwoLinkedLists(l1.next, l2);
        return l1;
    }
    
    l2.next = mergeTwoLinkedLists(l1, l2.next);
    return l2;
}