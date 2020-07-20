def arrayMaximalAdjacentDifference(inputArray)
    return (0..(inputArray.size - 2)).to_a
    	.map{|i| (inputArray[i + 1] - inputArray[i]).abs}.max
end