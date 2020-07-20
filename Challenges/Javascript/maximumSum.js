let max = 0;

function swap(a, i, j) {
    let tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
}

function permute(a, l, h, q) {
    if(l == h) {
        let tmp = sum(a, q);
        if(max < tmp) max = tmp;
        return;
    }
    for(let i = l; i <= h; i++) {
        swap(a, l, i);
        permute(a, l + 1, h, q);
        swap(a, l, i);
    }
}

function sum(a, q) {
    let sum = 0;
    for(let e of q) for(let i = e[0]; i <= e[1]; i++) sum += a[i];
    return sum;
}

function maximumSum(a, q) {
    permute(a, 0, a.length - 1, q);
    return max;
}