def sumUpNumbers(inputString)
    sum, aux = 0, ""
    inputString.sub!(/[^\d]/, " ")
    
    inputString.size.times do |i|
        if /\D/.match? inputString[i]
            sum += aux.to_i
            aux = ""
            i -= 1
            next
        end
        aux += inputString[i]
    end
    sum += aux.to_i
    
    return sum
end