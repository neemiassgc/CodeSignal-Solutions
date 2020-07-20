function allLongestStrings(inputArray) {
    let max = inputArray.map( (e) => e.length)
        .reduce( (t, e) => t = e > t ? e: t);
    return inputArray.filter( (e) => e.length == max);
}