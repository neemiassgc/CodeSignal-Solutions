function areSimilar(a, b) {
    let c = 0;
    for(let i in a) if(a[i] != b[i]) c++;
    a.sort();
    b.sort();
    for(let i in a) if(a[i] != b[i]) return false;
    return c < 3;
}