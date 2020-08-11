function sortedSquaredArray(array) {
    return array.map(n => Math.abs(n) * Math.abs(n))
    .sort((a, b) => a - b);
}