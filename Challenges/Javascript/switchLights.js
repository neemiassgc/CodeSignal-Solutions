function switchLights(a) {
    for(let i in a) {
        if(a[i] == 1) a = a.map( (e, j) => e = j > i ? e : e == 1 ? 0 : 1);
    }
    return a;
}