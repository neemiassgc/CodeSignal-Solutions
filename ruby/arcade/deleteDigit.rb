def deleteDigit(n)
    ref, max = n.to_s, 0
    ref.size.times do |f|
        str, tmp = "", 0
        ref.size.times { |r| str += ref[r] unless r == f }
        tmp = str.to_i
        max = tmp if tmp > max
    end
    return max
end