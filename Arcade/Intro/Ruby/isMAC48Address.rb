def isMAC48Address(inputString)
    return /[0-9A-F]{2}(-[0-9A-F]{2}){5}/.match(inputString).to_s.eql?(inputString)
end