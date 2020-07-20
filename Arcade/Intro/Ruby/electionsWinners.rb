def electionsWinners(votes, k)
    winners = 0
    votes.size.times do |i|
        win = true
        votes.size.times do |j|
            if i != j and votes[i] + k <= votes[j]
                win = !win
                break
            end
        end
        winners += 1 if win
    end
    return winners
end