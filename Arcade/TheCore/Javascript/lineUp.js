function lineUp(commands) {
    let count = 0;
    let smartStudent = 0;
    let dumbStudent = 0;
    
    for (let c of commands) {
        if (c === "L" || c === "R") {
            smartStudent--;
            dumbStudent++;   
        }
        else if (c === "A") {
            smartStudent = smartStudent + 2;
            dumbStudent = dumbStudent + 2;
        }
            
        smartStudent = smartStudent < 0 ? smartStudent + 4 : smartStudent % 4;
        dumbStudent = dumbStudent < 0 ? dumbStudent + 4 : dumbStudent % 4;
        
        if (smartStudent == dumbStudent) count++;
    }
    
    return count;
}