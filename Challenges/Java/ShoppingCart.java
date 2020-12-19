class ShoppingCart {
    
    String[] shoppingCart(String[] requests) {
        Set<Item> cart = new TreeSet();
        int index = 1;
        
        for(String s : requests) {
            String[] parts = s.split(" : ");
            
            switch(parts[0]) {
                case "add":
                    cart.add(new Item(index, parts[1]));
                    break;
                case "remove":
                    for(Item i : cart) {
                        if(i.name.equals(parts[1])) {
                            cart.remove(i);
                            break;
                        }
                    }
                    break;
                case "quantity_upd":
                    for(Item i : cart) {
                        if(i.name.equals(parts[1])) {
                            i.qt += Integer.parseInt(parts[2]);
                            break;
                        }
                    }
                    break;
                case "checkout":
                    cart.clear();
                    break;
            }
                
            index++;
        }
        
        return cart.stream().map(e -> e.name+" : "+e.qt)
            .toArray(String[]::new);
    }
}

class Item implements Comparable<Item> {
    
    int index;
    String name;
    int qt = 1;
    
    Item(int index, String name) {
        this.index = index;
        this.name = name;
    }
    
    @Override
    public int compareTo(Item other) {
        return this.index - other.index;
    }
}