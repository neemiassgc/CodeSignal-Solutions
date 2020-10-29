final class ProCategorization {
    
    String[][][] proCategorization(String[] pros, String[][] preferences) {
        Map<String, String[]> map = new HashMap<>();
        List<String[][]> output = new Vector<>();
        
        for(int i = 0; i < pros.length; i++)
            map.put(pros[i], preferences[i]);
        
        for(String a : Stream.<String[]>of(preferences)
        .flatMap(e -> Stream.<String>of(e)).distinct()
        .sorted().toArray(String[]::new)) {
            List<String> auxList = new Vector<>();
            
            for(String k : map.keySet())
                if(Stream.<String>of(map.get(k))
                .anyMatch(e -> e.equals(a)))
                    auxList.add(k);
                    
            output.add(new String[][]{{a},auxList.stream().sorted()
            .toArray(String[]::new)});
        }
        
        return output.toArray(String[][][]::new);
    }
}