final class MissedClasses {

	boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 > 0) || (year % 400 == 0);
	}

	int missedClasses(int year, int[] daysOfTheWeek, String[] holidays) {
	    int[] months = {9, 10, 11, 12, 1, 2, 3, 4, 5};
	    int[] monthLengths = {30, 31, 30, 31, 31, 28, 31, 30, 31};
	    java.time.LocalDate date = null;
	    int out = 0;

	    boolean b = true;

	    for(int i = 0, m = 0; i < monthLengths.length; i++, m++, b = true) {
	        year = m == 4 ? year + 1 : year;
	        for(int d = 1; d <= monthLengths[i]; d++) {
	            date = java.time.LocalDate.of(year,
	                            isLeapYear(year) && m == 5
	                            ? months[m] + 1 : months[i], d);

	            for(String s : holidays) {
	                int month = date.getMonthValue();
	                int day = date.getDayOfMonth();
	                if(((month <= 9 ? "0"+month : month)+"-"+
	                (day <= 9 ? "0"+day : day)).equals(s)) {
	                    
	                    for(int w : daysOfTheWeek) {
	                        if(date.getDayOfWeek().getValue() == w) {
	                            out++;
	                        }
	                    }
	                } 
	            }

	            if(b) {
	                System.out.println(date.getDayOfWeek().getValue());
	                b = false;
	            }
	        }
	    }
	    return out;
	}

	public static void main(String[] args) {
		String[] holidays = {"01-20","02-09","01-25","09-01","05-30","12-24","09-05","10-15","09-25","10-23","10-10","05-29","02-05","11-19","04-28","02-17","05-04","01-26","05-31","03-19","12-31","09-26","05-19","05-14","09-03","05-21","02-08","11-09","09-09","04-21"};
		int[] daysOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
		int year = 2067;
		
		MissedClasses mc = new MissedClasses();
		System.out.println(mc.missedClasses(year, daysOfTheWeek, holidays));
	}
}