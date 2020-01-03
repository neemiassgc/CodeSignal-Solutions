def variableName(name)
    if /[^\d\s]/.match(name[0]).to_s.eql? name[0] then
        return true if /\w*/.match(name).to_s.eql? name
    end
    return false
end