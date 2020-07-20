def digitsProduct(product)
    return 10 if product == 0
    return product if product < 10

    s = "";
    9.downto(2).each do |d|
        while product % d == 0
            s = d.to_s+s
            product /= d
        end
    end
    return product == 1 ? s.to_i : -1;
end