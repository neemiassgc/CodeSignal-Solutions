def findEmailDomain(address)
    pieces = address.split /@/
    return pieces[pieces.size - 1]
end