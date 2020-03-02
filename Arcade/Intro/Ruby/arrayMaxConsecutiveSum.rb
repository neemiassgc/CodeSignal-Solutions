def arrayMaxConsecutiveSum(inputArray, k)
    max, len = 0, inputArray.size
    len.times do |i|
        sum = 0
        if len - i + 1 > k then
            k.times { |j| sum += inputArray[i + j] }
            max = sum if sum > max
        end
    end
    return max
end