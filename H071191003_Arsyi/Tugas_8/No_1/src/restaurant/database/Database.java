package restaurant.database;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class Database {
    private final Menu menu;
    private static Database database;
    private int total = 0;
    private Database() {
        menu = new Menu();
    }
    private ArrayList<String> shoppingCart = new ArrayList<>();

    public Database getDatabase() {
        return database;
    }
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public Menu getMenu() {
        return menu;
    }

    public void addToShoppingCart(String item) {
        if (item != null) {
            shoppingCart.add(item);
            total += menu.getItemPrice(item);
        }
        printShoppingCartDetails();

    }

    public ArrayList<String> displayMenuItems() {
        ArrayList<String> formattedItems = new ArrayList<>();
        for (String item : menu.getItems()){
            formattedItems.add(String.format("%s (Rp. %d)",item, menu.getItemPrice(item)));
        }
        return formattedItems;
    }

    public void removeItem(String item) {
        if (shoppingCart.contains(item)) {
            shoppingCart.remove(item);
            total -= menu.getItemPrice(item);
        }
        printShoppingCartDetails();

    }

    public int getItemCount(String checkedItem) {
        int count = 0;
        for (String item : shoppingCart){
            if (item.equals(checkedItem)){
                count ++;
            }
        }
        return count;
    }

    public int getTotalItemPrice(String checkedItem) {
        int count = 0;
        for (String item : shoppingCart) {
            if (checkedItem.equals(item)) {
                count++;
            }
        }
        return menu.getItemPrice(checkedItem)*count;
    }

    public void checkout() {
        shoppingCart = new ArrayList<>();
        total = 0;
    }
    public String printShoppingCartDetails() {
        StringBuilder details = new StringBuilder("====Banana Shack====\n");

        details.append("Items :\n");
        int itemIndex = 0;
        if (shoppingCart.size() == 0) {
            details.append("Shopping Cart is Empty!\n");
        }
        for (String itemName : new ArrayList<>(new HashSet<>(shoppingCart))){
            itemIndex++;
            details.append(String.format("%d.\t%s\n", itemIndex, itemName));
            details.append(String.format("\tIndividual Price\t: %s\n", formatNumber(menu.getItemPrice(itemName))));
            details.append(String.format("\tQuantity \t\t: %s\n", getItemCount(itemName)));
            details.append(String.format("\tPrice \t\t\t: %s\n", formatNumber(getTotalItemPrice(itemName))));
        }
        details.append("\n");
        details.append(String.format("Amount of Items\t: %d\n", shoppingCart.size()));
        details.append(String.format("Total Price\t\t\t: Rp.%s\n", formatNumber(total)));
        details.append("Thank you for shopping at Banana Shack");
        return details.toString();
    }
    private String formatNumber(int number) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("da", "DK"));
        return nf.format(number);
    }




}
