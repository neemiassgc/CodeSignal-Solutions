function arrayReplace(inputArray, elemToReplace, substitutionElem) {
    return inputArray.map(i => i == elemToReplace ? substitutionElem : i)
}