function containsDuplicates(a) {
    let o = []
    for(let e of a) if(!o.includes(e)) o.push(e)
    return o.length != a.length
}