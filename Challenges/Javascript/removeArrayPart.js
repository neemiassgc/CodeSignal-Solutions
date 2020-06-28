function removeArrayPart(a, l, r) {
    let out = [];
    for(let i = 0; i < a.length; i++) if(i < l || i > r) out.push(a[i]);
    return out;
}