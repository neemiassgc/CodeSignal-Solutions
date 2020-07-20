function arrayMaximalAdjacentDifference(inputArray) {
    let max = 0;
    for(let i = 0; i < inputArray.length - 1; i++) {
        let t = Math.abs(inputArray[i] - inputArray[i + 1]);
        if(t > max) max = t;
    }
    return max;
}