function replaceMiddle(arr) {
    if (arr.length % 2 == 0)
        arr.splice(
            arr.length / 2 - 1, 2,
            arr[arr.length / 2] + arr[arr.length / 2 - 1]
        )
    
    return arr
}