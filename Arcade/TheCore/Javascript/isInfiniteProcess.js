function isInfiniteProcess(a, b) {
    return !((a < b && Math.abs(a - b) % 2 == 0) || a == b);
}