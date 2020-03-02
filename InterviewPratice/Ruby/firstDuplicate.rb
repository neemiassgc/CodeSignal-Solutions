def firstDuplicate a
    a.each do |i|
        return i.abs if a[i.abs - 1] < 0
        a[i.abs - 1] *= -1
    end
    return -1
end