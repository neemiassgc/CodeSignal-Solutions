fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
  return inputArray
    .map { if (elemToReplace == it) substitutionElem else it }.toMutableList()
}