def groupsOfAnagrams w
    w.map{ |x| x.chars.sort.join }.uniq.size
end