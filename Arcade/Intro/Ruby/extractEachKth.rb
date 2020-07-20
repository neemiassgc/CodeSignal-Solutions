def extractEachKth(inputArray, k)
    return (0...inputArray.size).to_a
    .filter{|i| (i + 1) % k != 0}.map{|i| inputArray[i]}
end