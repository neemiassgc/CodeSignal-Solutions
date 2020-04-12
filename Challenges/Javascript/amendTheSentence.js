function amendTheSentence(s) {
    let parts = s.split(/(?=[A-Z])/);
    return parts.map( (e) => { return e.toLowerCase(); } ).join(" ");
}