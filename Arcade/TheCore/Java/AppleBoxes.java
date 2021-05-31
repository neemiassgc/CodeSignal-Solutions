final class AppleBoxes {
    
    int appleBoxes(int k) {
        int yellowApples = 0, redApples = 0;
        
        for (int n = 0; n <= k; n++) {
            if (n % 2 == 0) redApples += n * n;
            else yellowApples += n * n;
        }
        
        return redApples - yellowApples;
    }
}