def validTime(time)
    return (time[0..1].to_i < 24 and time[3..4].to_i < 60)
end