function avoidObstacles(inputArray) {
    let k = true;
    for(let i = 2; ; i++) {
        for(let o of inputArray) {
            if(o % i == 0) {
                k = !k;
                break;
            }
        }
        if(k) return i;
        k = true;
    }
}