# Singly-linked lists are already defined with this interface:
# class ListNode
#   attr_accessor :value, :next
#   def initialize(val)
#     @value = val
#     @next = nil
# end
#
def nthElementFromTheEnd(l, n)
    out, ln = [], l
    while ln do
        out.push ln.value
        ln = ln.next
    end
    return n > out.size ? -1 : out[out.size - n]
end
