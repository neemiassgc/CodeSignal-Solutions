def reverseInteger x
    a = x.to_s.reverse
    x < 0 ? ("-"+a).to_i : a.to_i
end