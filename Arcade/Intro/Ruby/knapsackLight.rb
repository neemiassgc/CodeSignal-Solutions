def knapsackLight(value1, weight1, value2, weight2, maxW)
    return value1 + value2 if maxW >= weight1 + weight2
    return value2 if value2 > value1 and maxW >= weight2
    return value1 if value1 > value2 and maxW >= weight1
    return value1 if maxW >= weight1
    return value2 if maxW >= weight2
    return 0
end