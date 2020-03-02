def isIPv4Address(inputString)
	reg, c = /\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}/, 0
    b = reg.match(inputString).to_s.eql?(inputString)
    inputString.split("\.").each do |i|
        c += i.to_i > 255 ? 1 : 0
    end if b
    return (b and c == 0)
end