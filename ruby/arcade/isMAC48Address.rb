def isMAC48Address(inputString)
    reg = /[0-9A-F]{2}(-[0-9A-F]{2}){5}/
    return reg.match(inputString).to_s.eql?(inputString)
end