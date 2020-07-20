final class MaximumSum {

    int max;

    void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    void permute(int[] arr, int l, int h, int[][] q) {
        if(l == h) {
            int sum = 0;
            for(int[] e : q) for(int i = e[0]; i <= e[1]; i++) sum += arr[i];
            if(max < sum) max = sum;
            return;
        }
        for(int i = l; i <= h; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, h, q);
            swap(arr, l, i);
        }
    }

    int maximumSum(int[] a, int[][] q) {
        permute(a, 0, a.length - 1, q);
        return max;
    }
}