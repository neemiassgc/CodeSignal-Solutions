import java.util.Calendar;

final class DayOfWeek {
    
    int dayOfWeek(String birthdayDate) {
        Calendar date = Calendar.getInstance();
        int[] fields = Arrays.stream(birthdayDate.split("-"))
        .mapToInt(n -> new Integer(n)).toArray();
        int week = 0, year = fields[2] + 1;
        
        date.set(Calendar.YEAR, fields[2]);
        date.set(Calendar.MONTH, fields[0] - 1);
        date.set(Calendar.DAY_OF_MONTH, fields[1]);
        
        week = date.get(Calendar.DAY_OF_WEEK);
        
        if(fields[1] == 29) {
            for(;; year++) {
                date.set(Calendar.YEAR, year);
                if(year % 4 == 0 && year % 100 != 0) {
                    date.set(Calendar.DAY_OF_MONTH, 29);
                    if(date.get(Calendar.DAY_OF_WEEK) == week) break;
                }
            }  
        }
        else {
            for(;; year++) {
                date.set(Calendar.YEAR, year);
                if(date.get(Calendar.DAY_OF_WEEK) == week) break;
            }  
        }
        
        return year - fields[2];
    }
}