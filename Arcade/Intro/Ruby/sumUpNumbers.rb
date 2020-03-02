def sumUpNumbers(inputString)
    sum, nums = 0, ""
    inputString.size.times do |i|
    	b = inputString[i].ord
    	if b >= 48 and b <= 57 then nums += inputString[i]
    	else
    		sum += nums.to_i
    		nums.clear
    	end
    	sum += nums.to_i if nums.size > 0 and i == inputString.size - 1
    end
    return sum
end