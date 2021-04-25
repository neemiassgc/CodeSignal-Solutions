function magicalWell(a, b, n) {
    let dolar = 0
    for (let i = 0; i < n; i++) dolar += a++ * b++
    return dolar
}