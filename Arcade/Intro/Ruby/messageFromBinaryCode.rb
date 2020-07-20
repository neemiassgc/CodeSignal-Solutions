def messageFromBinaryCode(code)
    return code.split(/(?<=\G.{8})/).map{|v| v.to_i(2).chr}.join
end