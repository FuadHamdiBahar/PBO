public class Item implements Cloneable{
    private String name;
    private int price;
    private String info;
    private int type;

    public Item(String name, int price, String info, int type) {
        this.name = name;
        this.price = price;
        this.info = info;
        this.type = type;
    }

    public String getInfo() {
        //This method returns information about the current Item
        return String.format("Item : %s" +
                             "\n\tDescription : %s" +
                             "\n\tPrice : %d", name, info, price
                            );
    }
    public void use() {
        if (type == 0) {
            //Use Potion
            System.out.println("You feel rejuvenated!");
        }
        if (type == 1) {
            //Use Sword
            System.out.println("Your power is relentless!");
        }
        destroy();
    }
    public int getPrice() {
        return price;
    }
    public Item sell() {
        //This method returns a cloned version the current Item, which will be received by a buyer
        Item clone = null;
        try{
            clone = this.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        destroy();
        return clone;
    }
    private void destroy() {
        //This method removes all information about the current Item
        type = -1;
        name = "---";
        price = 0;
        info = "nothing";
    
    }

    public int getType() {
        //type -1 = empty;
        //type 0 : potion
        //type 1 : weapon
        return type;
    }

    protected Item clone() throws CloneNotSupportedException{
        return (Item) super.clone();
    }

}