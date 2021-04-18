function arrayPacking(a) {
    return parseInt(
        a.map(v => v.toString(2))
            .reverse()
            .map(e => "0".repeat(8 - e.length) + e)
            .join(""), 2
    );
}