def arrayReplace(inputArray, elemToReplace, substitutionElem)    
    return inputArray.map{|e| e == elemToReplace ? substitutionElem : e}
end