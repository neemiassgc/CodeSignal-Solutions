final class PrimeSum2 {

    int primesSum2(int n) {
        boolean[] prime = new boolean[n + 1];
        int sum = 0;
        
        Arrays.fill(prime, true);

        for(int p = 2; p * p <= n; p++) {
            if(prime[p]) {
                for(int i = p * p; i <= n; i += p) prime[i] = false;
            }
        }

        for(int i = 2; i <= n; i++) if(prime[i]) sum += i;

        return sum;
    }
}