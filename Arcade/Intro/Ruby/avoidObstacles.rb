def avoidObstacles(inputArray)
	k, i = true, 2
    loop do
        inputArray.each do |e|
            if e % i == 0
                k = !k
                break
            end
        end
        return i if k
        k, i = true, i + 1
    end
end