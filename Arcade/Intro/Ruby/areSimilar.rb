def areSimilar(a, b)
    c = 0
    a.size.times {|i| c += 1 if a[i] != b[i]}
    return a.sort == b.sort && c < 3
end