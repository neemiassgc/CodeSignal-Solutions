def fileNaming(names)
    list = []
    names.size.times do |i|
        unless list.include? names[i] then list.push names[i]
        else 
            s, n = names[i], 0
            while list.include? s do
                n += 1
                s = names[i]+"(#{n.to_s})"
            end
            list.push s
        end
    end
    return list
end