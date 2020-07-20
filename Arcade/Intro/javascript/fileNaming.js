function fileNaming(names) {
    let set = [];
    for(let i in names) {
        let aux = names[i];
        for(let k = 1; set.includes(aux); k++) aux = names[i]+"("+k+")";
        set.push(aux);
    }
    return set;
}