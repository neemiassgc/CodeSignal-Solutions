function nextLarger(a) {
    let out = [];

    for(let x = -1, i = 0, f = 0; i < a.length; i++, f = 0) {
        for(let j = i; j < a.length; j++) {
            if(a[j] > a[i]) {
                f = a[j];
                break;
            }
        }
        out.push(f > 0 ? f : -1);
    }

    return out;
}
