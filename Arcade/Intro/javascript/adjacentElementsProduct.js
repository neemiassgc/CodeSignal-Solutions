function adjacentElementsProduct(inputArray) {
    let max = inputArray[0] * inputArray[1];
    
    for(let i = 0; i < inputArray.length - 1; i++) {
        let p = inputArray[i] * inputArray[i + 1];
        if(p > max) max = p;
    }
    
    return max;
}