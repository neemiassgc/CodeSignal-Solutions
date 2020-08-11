function findSubarrayBySum(s, arr) {
    for(let i = 0; i < arr.length; i++) {
        let sum = 0;
        for(let j = i; j < arr.length; j++)
            if((sum += arr[j]) == s) return [i + 1, j + 1];
    }
    
    return [-1];
}