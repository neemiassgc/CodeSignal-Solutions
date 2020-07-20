def depositProfit(deposit, rate, threshold)
    y = 1
    loop do
        return y if (deposit += rate / 100.0 * deposit) >= threshold
        y += 1
    end
end