def fileNaming(names)
    set = []
    names.size.times do |i|
        aux, k = names[i], 1
        while set.include? aux
            aux = names[i]+"("+k.to_s+")"
            k += 1
        end
       set.push aux
    end
    
    return set
end