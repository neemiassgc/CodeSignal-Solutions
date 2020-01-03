import java.util.ArrayList;

public class SugarHigh {

	static int[] sugarHigh(int[] candies, int threshold) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] <= threshold) {
				list.add(Integer.valueOf(i));
				threshold -= candies[i];
			}
		}
		int[] newArray = new int[list.size()];
		int idx = 0;
		for (Integer i : list) {
			newArray[idx] = i.intValue();
			idx++;
		}
		return newArray;
	}

	public static void main (String[] args) {

		int[] candy = {34, 5, 56, 67, 8, 89};
		int sugar = 50;

		for (int i : sugarHigh(candy, sugar)) {
			System.out.print(i+"-");
		}
		System.out.println();
	}
}