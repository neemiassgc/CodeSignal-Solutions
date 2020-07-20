function alternatingSums(a) {
    let o = [0, 0];
    for(let i in a) o[i % 2 == 0 ? 0 : 1] += a[i];
    return o;
}