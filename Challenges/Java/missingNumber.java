final class MissingNumber {
    
    int missingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int out = 0;

        for(int i : arr) {
            set.add(i);
        }
        for(int i = 0; i <= arr.length; i++) {
            if(!set.contains(i)) {
                out = i;
                break;
            }
        }
        return out;
    }
}