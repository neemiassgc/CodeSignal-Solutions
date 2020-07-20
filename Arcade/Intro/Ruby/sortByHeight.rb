def sortByHeight(a)
    a.size.times do |i|
		(i..(a.size - 1)).each do |j|
			if a[i] != -1 && a[j] != -1
                if a[i] > a[j]
                    tmp = a[i]
                    a[i] = a[j]
                    a[j] = tmp
                end
            end
		end
	end
	
	return a
end