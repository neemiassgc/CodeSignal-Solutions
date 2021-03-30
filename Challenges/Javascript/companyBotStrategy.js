function companyBotStrategy(trainingData) {
    let q = 0, sum = 0;
    
    for(let i of trainingData)
        if(i[1] == 1) {
            q++;
            sum += i[0];
        }
        
    return q > 0 ? sum / q : 0;
}