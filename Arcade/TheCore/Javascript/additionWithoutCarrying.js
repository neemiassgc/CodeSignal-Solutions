function additionWithoutCarrying(param1, param2) {
    let p1 = param1+"";
    let p2 = param2+"";
    let result = "";
    const len = Math.max(p1.length, p2.length)
    
    p1 = "0".repeat(len - p1.length) + p1;
    p2 = "0".repeat(len - p2.length) + p2;
    
    for (let i = len - 1; i >= 0; i--) {
        const aux = (parseInt(p1[i]) + parseInt(p2[i]))+"";
        result = aux[aux.length - 1] + result;
    }

    return parseInt(result);
}
