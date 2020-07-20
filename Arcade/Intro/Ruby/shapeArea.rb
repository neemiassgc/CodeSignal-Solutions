def shapeArea(n)
    area = 1
    n.downto(1){|e| area += (e - 1) * 4}
    return area
end