function extractEachKth(inputArray, k) {
    let indexes = [];
    for(let i = 0; i < inputArray.length; i++) indexes.push(i);
    return indexes.filter(i => (i + 1) % k != 0).map(i => inputArray[i]);
}