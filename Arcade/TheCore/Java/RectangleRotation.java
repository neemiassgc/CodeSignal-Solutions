final class RectangleRotation {

    int solution(int a, int b) {
        double aBisect = a / Math.sqrt(2) / 2;
        double bBisect = b / Math.sqrt(2) / 2;
        
        int[] rect1 = new int[] {
            ((int) Math.floor(aBisect)) * 2 + 1,
            ((int) Math.floor(bBisect)) * 2 + 1
        }; 
        
        int[] rect2 = new int[] {
            aBisect - Math.floor(aBisect) < 0.5 ? rect1[0] - 1 : rect1[0] + 1,
            bBisect - Math.floor(bBisect) < 0.5 ? rect1[1] - 1 : rect1[1] + 1
        };
        
        return rect1[0] * rect1[1] + rect2[0] * rect2[1];
    }
}