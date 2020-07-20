function sortByHeight(a) {
    for(let i = 0; i < a.length; i++) {
        for(let j = i + 1; j < a.length; j++) {
            if(a[i] != -1 && a[j] != -1) {
                if(a[i] > a[j]) {
                    let tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    
    return a;
}