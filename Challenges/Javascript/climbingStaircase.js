let jumps = []

function combination(arr,i, n, rn, u) {
    if(rn < 0) return;

    if(rn == 0) {
        let tmp = [];
        for(let j = 0; j < i; j++) tmp.push(arr[j]);
        jumps.push(tmp);	
        return;
    }

    for(let k = 1; k <= n; k++) {
        if(k <= u) {
            arr[i] = k;
            combination(arr, i + 1, n, rn - k, u);
        }
    }
}

function climbingStaircase(n, k) {
    combination([], 0, n, n, k);
    return jumps;
}