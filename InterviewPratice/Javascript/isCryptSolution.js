const isCryptSolution = (crypt, solution) => {
    let reg = /^0+\d+/g
    for(let x = 0; x < solution.length; x++) {
        for(let y = 0; y < 3; y++) {
            while(crypt[y].includes(solution[x][0])) {
                crypt[y] = crypt[y].replace(solution[x][0], solution[x][1])
            }
        }
    }
    if(reg.test(crypt[0]) || reg.test(crypt[1]) 
        || reg.test(crypt[2]) ) { return false }
    return (Number(crypt[0]) + Number(crypt[1]) == Number(crypt[2]))
}