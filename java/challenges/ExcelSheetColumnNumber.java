public final class ExcelSheetColumnNumber {

	int excelSheetColumnNumber(String s) {
	    int sum = 0, l = s.length() - 1;
	    for(int i = 0; i < s.length(); i++, l--) {
	        int a = (byte)s.charAt(i) - 64;
	        for(int j = 0; j < l; j++) { a *= 26; }
	        sum += a;
	    }
	    return sum;
	}
}