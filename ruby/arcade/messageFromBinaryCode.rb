def messageFromBinaryCode(code)
    bin, msg = "", ""
    (1..code.size).each do |c|
        bin += code[c - 1]
        if c % 8 == 0 then
            msg += (bin.to_i 2).chr
            bin = ""
        end
    end
    return msg
end