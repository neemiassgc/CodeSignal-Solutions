function variableName(name) {
    let test = /^[a-zA-Z_]\w*/.exec(name);
    return test != null && test[0] === name;
}