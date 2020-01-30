def firstNotRepeatingCharacter s
    s.chars.uniq.each do |c|
        if s.include? c
            return c if s.chars.count(c) == 1
        end
    end
    return "_"
end