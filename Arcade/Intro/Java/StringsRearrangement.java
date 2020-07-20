import java.util.Arrays;
import java.util.ArrayList;

final class StringsRearrangement {

	boolean flag;

	boolean check(String s1, String s2) {
	    int counter = 0;
	   
	    for(int i = 0; i < s1.length(); i++)
	        if(s1.charAt(i) != s2.charAt(i)) counter++;
	    
	    return counter == 1;
	}

	void permute(String[] arr, int l, int h) {
	    if(l == h) {
	        flag = true;
	        for(int i = 0; i < arr.length - 1; i++)
	            if(!check(arr[i], arr[i + 1])) {
	                flag = false;
	                break;
	            }
	    }
	    else {
	        for(int i = l; i <= h && !flag; i++) {
	            swap(arr, l, i);
	            permute(arr, l + 1, h);
	            swap(arr, l, i);
	        }
	    }
	}

	void swap(String[] arr, int i, int j) {
	    String tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp;
	}

	boolean stringsRearrangement(String[] inputArray) {
	    permute(inputArray, 0, inputArray.length - 1);
	    return flag;
	}
}