function increaseNumberRoundness(n) {
    // Array.prototype.swap = function(i, j) {
    //     const tmp = this[i];
    //     this[i] = this[j];
    //     this[j] = tmp;
    // }
    
    // const s = [...n+""];
    
    // for (let i = 0; i < s.length; i++) {
    //     if (s[i] === "0") {
    //         for (let j = i + 1; j < s.length; j++) {
    //             s.swap(i, j);
    //             if (parseInt(s.join("")) > n) return true;
    //         }
    //     }
    // }
    
    // return false;
    
    return /0[1-9]/.test(n);
}