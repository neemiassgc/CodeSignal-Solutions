function fileNaming(names) {
    let list = [];
    for(let i in names) {
        if(!list.includes(names[i])) {
            list.push(names[i]);
            continue;
        }
        let s = names[i];
        for(let n = 1; list.includes(s); n++) {
            s = names[i]+"("+n+")";
        }
        list.push(s);
    }
    return list;
}