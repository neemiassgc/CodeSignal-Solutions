def higherVersion2(a, b)
    x, y, i = a.split(/\./), b.split(/\./), 0
    loop do
        return 0 unless x[i]
        t, d = x[i].to_i, y[i].to_i
        return 1 if t > d
        return -1 if t < d
        i += 1
    end
end