function solution(a, b) {
    const aBisect = (a / Math.sqrt(2)) / 2
    const bBisect = (b / Math.sqrt(2)) / 2
    
    const rect1 = [Math.floor(aBisect) * 2 + 1, Math.floor(bBisect) * 2 + 1]
    const rect2 = [
        aBisect - Math.floor(aBisect) < 0.5 ? rect1[0] - 1 : rect1[0] + 1,
        bBisect - Math.floor(bBisect) < 0.5 ? rect1[1] - 1 : rect1[1] + 1
    ]
    
    return rect1[0] * rect1[1] + rect2[0] * rect2[1]
}