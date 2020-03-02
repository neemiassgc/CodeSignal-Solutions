def makeArrayConsecutive2(statues)
	f = 0
    a = (statues.min..statues.max).to_a
    a.each do |v|
        f += 1 if not statues.include?(v)
    end
    return f
end