function fact(n) {
	if (n == 1) return n;
	return n * fact(n - 1);
}

function leastFactorial(n) {
    for (let i = 1; true; i++) {
        let f = fact(i)
        if (f >= n) return f;
    }
}