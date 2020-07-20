def variableName(name)
    return /^[a-zA-Z_]\w*/.match(name).to_s.eql? name
end