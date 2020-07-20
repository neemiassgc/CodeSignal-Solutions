function addBorder(picture) {
    let border = "*".repeat(picture[0].length + 2), o = [border];
    for(let e of picture) o.push("*"+e+"*");
    o.push(border);
    return o;
}