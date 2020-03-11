class Item {
    private String name;
    private int price;
    private String info;

    public Item(String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getInfo() {
        return info;
    }
    public static void descItem(Item items){
        System.out.println("name\t:" +items.getName());
        System.out.println("price\t:" +items.getPrice());
        System.out.println("Info\t" +items.getInfo());
    }
    public static void descMyItem(Item blankItems) {
        System.out.println("name\t:" +blankItems.getName());
        System.out.println("price\t:" +blankItems.getPrice());
        System.out.println("Info\t:" +blankItems.getInfo());
    }
}