public class CenturyFromYear {

	int centuryFromYear(int year) {
	    boolean bool = year / 100 * 100 < year;
	    if (bool == true){
	        return year / 100 + 1;
	    }
	    return year / 100;
	}
}