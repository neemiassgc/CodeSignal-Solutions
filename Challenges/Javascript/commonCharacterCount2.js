function commonCharacterCount2(s) {
    let out = 0, set = [];

    for(let i = 97, k = 0; i <= 122; i++, k = 0) {
        let ch = '';
        for(let str of s) {
            ch = String.fromCharCode(i);
            if(!str.includes(ch)) {
                k++;
                break;
            }
        }
        if(k == 0) {
            set.push(ch);
        }
    }

    for(let x of set) {
        let min = 0;
        for(let str of s) {
            let count = 0;
            for(let y of str) {
                if(x === y) {
                    count++;
                }
            }
            min = count < min ? count : min == 0 ? count : min;
        }
        out += min;
    }
    return out;
}
