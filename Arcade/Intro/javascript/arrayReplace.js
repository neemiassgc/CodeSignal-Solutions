function arrayReplace(inputArray, elemToReplace, substitutionElem) {
    return inputArray.map(n => n === elemToReplace ? substitutionElem : n);
}