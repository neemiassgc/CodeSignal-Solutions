function arrayMaxConsecutiveSum(inputArray, k) {
    let max = 0, t = 0;
       
    for(let i = 0; i <= inputArray.length - k; i++, t = 0) {
        for(let j = i; j < i + k; j++) t += inputArray[j];
        if(t > max) max = t;
    }
    
    return max;
}