import java.util.*;

final class GroupingDishes {

    String[][] groupingDishes(String[][] dishes) {
        ArrayList<String[]> carry = new ArrayList<>(), item = new ArrayList<>();
        ArrayList<String> dish = new ArrayList<>();
        String[][] output = null;

        for(String[] x : dishes) {
            for(int y = 1; y < x.length; y++) {
                ArrayList<String> tmp = new ArrayList<>();

                for(String[] i : dishes) {
                    for(int j = 1; j < i.length; j++) {
                        if(x[y] == i[j]) {
                            tmp.add(i[0]);
                        }
                    }
                }

                if(tmp.size() > 1 &&
                    !item.contains(tmp) &&
                    !dish.contains(x[y])) {

                    dish.add(x[y]);
                    item.add(tmp.toArray(new String[tmp.size()]));
                }
            }
        }

        dish.sort(null);
        for(int i = 0; i < item.size(); i++) {
            ArrayList<String> tmp = new ArrayList<>();

            Arrays.sort(item.get(i));
            
            tmp.add(dish.get(i));
            for(String y : item.get(i)) {
                tmp.add(y);
            }

            carry.add(tmp.toArray(new String[tmp.size()]));
        }        
        
        // return output.toArray(new String[output.size()][output.get(0).length]);
        output = new String[carry.size()][carry.get(0).length];
        for(String[] x : output) {
            Arrays.fill(x, "");
        }

        for(int j = 0; j < carry.size(); j++) {
            for(int i = 0; i < carry.get(j).length; i++) {
                output[j][i] = carry.get(j)[i];
            }
        }

        return output;
    }

    public static void main(String[] arguments) {
        String[][] dishes = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                            {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                            {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                            {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        String[][] gd = new GroupingDishes().groupingDishes(dishes);

        for(String[] x : gd) {
            for(String y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}