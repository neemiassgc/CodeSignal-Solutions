// Singly-linked lists are already defined with this interface:
// function ListNode(x) {
//   this.value = x;
//   this.next = null;
// }
//
function isListPalindrome(l) {
    let set = [];
    
    for(; l !=  null; l = l.next) set.push(l.value);
    
    for(let right = 0, left = set.length - 1; left >= 0; right++, left--)
        if(set[right] != set[left]) return false;
    
    return true;
}
