package restaurant.database;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private final HashMap<String, Integer> menu;

    public Menu() {
        menu = new HashMap<>();
        menu.put("Banana Split", 5000);
        menu.put("Chocolate Milk Shake", 5000);
        menu.put("Poo Nana", 12000);
        menu.put("LOL", 13000);
        menu.put("Pine Banana", 7000);
        menu.put("Fried Banana", 5000);



    }

    public int getItemPrice(String item) {
        return menu.get(item);
    }

    public ArrayList<String> getItems() {
        return new ArrayList<>(menu.keySet());
    }
}
