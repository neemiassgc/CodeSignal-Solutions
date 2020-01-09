def findEmailDomain(address)
    str = ""
    (address.size - 1).downto 0 do |i|
        unless address[i].eql? "@" then
            str += address[i]
        else
            return str.reverse
        end
    end
end