def arrayReplace(inputArray, elemToReplace, substitutionElem)
    inputArray.each_index do |i|
        inputArray[i] = substitutionElem if inputArray[i] == elemToReplace
    end
    return inputArray
end