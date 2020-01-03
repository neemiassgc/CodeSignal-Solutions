def depositProfit(deposit, rate, threshold)
    y = 1
    loop do
        deposit += deposit / 100.0 * rate
        return y if deposit >= threshold
        y += 1
    end
end