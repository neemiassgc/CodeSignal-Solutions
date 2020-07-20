function differentSquares(matrix) {
    let set = [];
    
    for(let x = 0; x < matrix.length - 1; x++) {
        for(let y = 0; y < matrix[0].length - 1; y++) {
            let aux = "";
            for(let i = x; i < x + 2; i++) {
                for(let j = y; j < y + 2; j++) aux += matrix[i][j];
            }
            if(!set.includes(aux)) set.push(aux);
        }
    }
    
    return set.length
}