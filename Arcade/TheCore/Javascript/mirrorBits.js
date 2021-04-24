function mirrorBits(a) {
    return parseInt([...a.toString(2)].reverse().join(""), 2)
}