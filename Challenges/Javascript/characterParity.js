function characterParity(symbol) {
    let d = symbol.codePointAt(0) - 48;
    if(d >= 0 && d <= 9) return d % 2 == 0 ? "even" : "odd";
    return "not a digit";
}