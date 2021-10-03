final class ReplaceMiddle {

    int[] replaceMiddle(int[] arr) {
        if (arr.length % 2 > 0) return arr;
        
        int sum = arr[arr.length / 2 - 1] + arr[arr.length / 2];
        
        arr[arr.length / 2 - 1] = sum;
        
        return IntStream.range(0, arr.length)
            .filter(i -> i != arr.length / 2)
            .map(i -> arr[i]).toArray();
    }
}