function countSumOfTwoRepresentations2(n, l, r) {
    if (2 * r < n || 2 * l > n) return 0;
    let min = Math.max(l, n - r);
    let max = Math.min(r, n - l);
    let mid = Math.floor((max + min) / 2);
    return mid - min + 1;
}