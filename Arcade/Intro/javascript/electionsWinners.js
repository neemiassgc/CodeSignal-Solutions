function electionsWinners(votes, k) {
    let winners = 0;
    for(let i = 0; i < votes.length; i++) {
        let win = true;
        for(let j = 0; j < votes.length; j++) {
            if(j != i && votes[i] + k <= votes[j]) {
                win = false;
                break;
            }
        }
        if(win) winners++;
    }
    return winners;
}