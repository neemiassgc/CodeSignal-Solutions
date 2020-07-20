function sumUpNumbers(inputString) {
    let sum = 0, aux = "";

    for(let i in inputString) {
        if(/\D/.test(inputString[i])) {
            if(!isNaN(parseInt(aux))) sum += parseInt(aux);
            aux = "";
            i -= 1;
            continue;
        }
        aux += inputString[i];
    }
    
    if(!isNaN(parseInt(aux))) sum += parseInt(aux);
    
    return sum;
}