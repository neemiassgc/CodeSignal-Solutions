def shapeArea(n)
   	area = 1
   	while n > 1 do
   		area += (n - 1) * 4
        n -= 1
   	end
   	return area
end