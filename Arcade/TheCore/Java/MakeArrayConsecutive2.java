final class MakeArrayConsecutive2 {
    
    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        
        final int max = statues[statues.length - 1];
        final int min = statues[0];
        int additionalStatues = 0;
        
        for (int statue = min; statue <= max; statue++)
            if (Arrays.binarySearch(statues, statue) < 0)
                additionalStatues++;
        
        return additionalStatues;
    }
}