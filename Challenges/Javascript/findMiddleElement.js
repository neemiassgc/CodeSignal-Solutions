// Singly-linked lists are already defined with this interface:
// function ListNode(x) {
//   this.value = x;
//   this.next = null;
// }
//
function findMiddleElement(l) {
    let counter = 0;
    let out = l;
	    
    for(let ref = l; ref != null; ref = ref.next) counter++;
    
    for(let i = 0; out != null
    && i < Math.floor(counter / 2); out = out.next, i++);
    
    return out.value;

}