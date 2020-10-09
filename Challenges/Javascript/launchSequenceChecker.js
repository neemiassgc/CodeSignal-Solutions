function launchSequenceChecker(systemNames, stepNumbers) {
    let map = {};
    
    for(let s of systemNames) map[s] = [];
    
    for(let i = 0; i < systemNames.length; i++)
        map[systemNames[i]].push(stepNumbers[i]);
    
    for(let s in map)
        for(let i = 0; i < map[s].length - 1; i++)
            if(map[s][i] >= map[s][i + 1]) return false;
    
    return true;
}