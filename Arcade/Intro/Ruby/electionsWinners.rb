def electionsWinners(votes, k)
    winners, len = 0, votes.size
    len.times do |i|
        isWinning = true
        len.times do |j|
            if j != i and not(votes[i] + k > votes[j]) then
                isWinning = !isWinning
                break
            end
        end
        winners += 1 if isWinning
    end
    return winners
end