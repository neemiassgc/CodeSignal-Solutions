fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if (maxW >= weight1 + weight2) return (value1 + value2);
    else if (value2 > value1 && maxW >= weight2) return value2;
    else if (value1 > value2 && maxW >= weight1) return value1;
    else if (maxW >= weight1) return value1;
    else if (maxW >= weight2) return value2;
    return 0;
}