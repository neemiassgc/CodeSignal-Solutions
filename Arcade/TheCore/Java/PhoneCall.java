final class PhoneCall {
    
    int phoneCall(int min1, int min2_10, int min11, int s) {
        int min = 0, q = 9;
        
        if(s >= min1) {
            s -= min1;
            min++;
        }
        
        for(int i = 0; i < 9; i++) {
            if(s >= min2_10) {
                s -= min2_10;
                min++;
                q--;
            }
        }
        
        if(q == 0) {
            while(s >= min11) {
                s -= min11;
                min++;
            }   
        }
        
        return min;
    }
}