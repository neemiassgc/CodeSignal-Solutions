def almostIncreasingSequence(sequence)
	l, lp, c = -100000, l, c = 0
    
    sequence.each do |e|
        if e <= l
            c += 1
            l = e if e > lp
            next
        end
        lp = l;
        l = e;
    end
    
    return c <= 1;
end