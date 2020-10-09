import java.util.regex.Pattern;

final class ShoppingList {

	double shoppingList(String items) {
	    return Pattern.compile("\\d+(?:\\.\\d*)?").matcher(items)
	    .results().map(e -> e.group()).mapToDouble(e -> Double.parseDouble(e))
	    .sum();
	}
}