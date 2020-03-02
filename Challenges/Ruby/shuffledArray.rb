def shuffledArray(shuffled)
    out, len, sum = 0, shuffled.size, 0
    len.times do |i|
        len.times { |j| sum += shuffled[j] unless j == i }
        if shuffled.include? sum then
            out = sum
            break;
        end
        sum = 0
    end
    shuffled.delete_at shuffled.index(out)
    return shuffled.sort!
end
