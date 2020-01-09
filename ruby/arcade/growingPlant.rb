def growingPlant(upSpeed, downSpeed, desiredHeight)
    c = h = 0
    loop do
        h += upSpeed
        c += 1
        break if h >= desiredHeight
        h -= downSpeed
    end
    return c
end