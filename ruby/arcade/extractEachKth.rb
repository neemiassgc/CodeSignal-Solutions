def extractEachKth(inputArray, k)
    arr = []
    (1..inputArray.size).each do |i|
        arr.push inputArray[i - 1] unless i % k == 0
    end
    return arr
end
