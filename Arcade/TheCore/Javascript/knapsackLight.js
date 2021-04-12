function knapsackLight(value1, weight1, value2, weight2, maxW) {
    if (maxW >= weight1 + weight2) return (value1 + value2);
    else if (value2 > value1 && maxW >= weight2) return value2;
    else if (value1 > value2 && maxW >= weight1) return value1;
    else if (maxW >= weight1) return value1;
    else if (maxW >= weight2) return value2;
    return 0;
}