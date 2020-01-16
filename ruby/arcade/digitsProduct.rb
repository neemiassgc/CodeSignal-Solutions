def digitsProduct(product)
    return 10 if product == 0
    return 1 if product == 1
    factor, res, work = "", 0, product
    9.downto 2 do |d|
        while work % d == 0 do
            work /= d
            factor.insert(0, d.to_s)
        end
    end
    res = (factor.to_i < product) ? -1 : factor.to_i if factor.size > 0
    res = -1 if factor.size == 0
    return res
end
