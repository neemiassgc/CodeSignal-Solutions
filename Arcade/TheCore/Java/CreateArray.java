final class CreateArray {

    int[] createArray(int size) {
        return IntStream.range(0, size).map(i -> 1).toArray();
    }
}