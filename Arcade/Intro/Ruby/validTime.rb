def validTime(time)
    ptrs = time.split ":"
    hh, mm = ptrs[0].to_i, ptrs[1].to_i
    return ((hh >= 0 and hh <= 23) and (mm >= 0 and mm <= 59))
end
