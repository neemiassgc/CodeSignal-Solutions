def arrayMaximalAdjacentDifference(inputArray)
    max = 0
    (inputArray.size - 1).times do |i|
        int = inputArray[i + 1] - inputArray[i]
        max = (int.abs > max) ? int.abs : max 
    end
    return max
end