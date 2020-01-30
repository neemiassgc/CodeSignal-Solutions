def classifyStrings s
    g = -> (a) do
        return (/[^aeiou]{5}/ =~ a or
        /[aeiou]{3}/ =~ a) ? "bad" : "good"
    end
    res = nil
    unless s.include? "?" then res = g.call s
    else
        s1 = g.call s.gsub("?", "a")
        s2 = g.call s.gsub("?", "n")
        if s.size > 4 and s.include? "???" then res = "mixed"
        elsif s1.eql? "bad" and s2.eql? "bad" then res = "bad"
        elsif s1.eql? "good" and s2.eql? "good" then res = "good"
        else res = "mixed"
        end
    end
    return res
end