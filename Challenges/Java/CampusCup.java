import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

final class CampusCup {
    
    String[] campusCup(String[] emails) {
        Map<String, Integer> points = new HashMap<>();
        
        emails = Stream.<String>of(emails)
            .map(e -> e.replaceFirst("^[a-z.]++@", ""))
            .toArray(String[]::new);
        
        for(String s : emails) {
            if(points.containsKey(s))
                points.put(s, points.get(s) + 20);
            else points.put(s, 20);
        }
        
        for(String s : points.keySet()) {
            int p = points.get(s).intValue();
            if(p >= 100 && p < 200) p = 3;
            else if(p >= 200 && p < 300) p = 8;
            else if(p >= 300 && p < 400) p = 15;
            else if(p >= 500) p = 25;
            else p = 0;
            
            points.put(s, p);
        }
        
        return points.entrySet().stream()
            .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
            .sorted((i, j) -> j.getValue().compareTo(i.getValue()))
            .map(v -> v.getKey())
            .toArray(String[]::new);
    }
}