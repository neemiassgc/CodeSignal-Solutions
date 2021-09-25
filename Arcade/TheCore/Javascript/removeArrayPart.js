function removeArrayPart(inputArray, l, r) {
    return inputArray.filter((v, i) => i < l || i > r)
}