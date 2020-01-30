public final class RotateImage {

    int[][] rotateImage(int[][] a) {
        int[][] out = new int[a.length][a[0].length];
        int i = a.length - 1;
        for(int x = 0; x < out[0].length; x++, i--) {
            for(int y = 0; y < out.length; y++) {
                out[y][x] = a[i][y];
            }
        }
        return out;
    }
}