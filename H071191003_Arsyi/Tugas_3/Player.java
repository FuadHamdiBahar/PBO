import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private final String name;
    private final String role;
    private int level = 0;
    private double damage;
    private double hp = 100;
    private int money = 100;
    private final Item[] items;
    private boolean alive = true;
    private double energy = 100;

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
        // Randomises the player's damage
        damage = ThreadLocalRandom.current().nextInt(3, 10);
        //Gives the player 3 basic items, which are 2 potions and 1 sword
        items = new Item[]{ new Item("Potion", 50, "Gives you 20 health", 0)
                            , new Item("Potion", 50, "Gives you 20 health", 0)
                            , new Item("Sword", 90, "+(2-10) damage", 1)
                          };
    }

    public String getName() {
        return name;
    }

    public boolean useSword() {
        for (Item item : items) {
            if (item.getType() == 1) { //Is the item a sword?
                //Increases the player's strength by a random amount between 2 - 10
                double increase = ThreadLocalRandom.current().nextDouble(2, 11);
                damage += increase;
                System.out.printf("+%f damage\n", increase);
                item.use();
                return true;
            }
        }
        System.out.println("You don't have a sword");
        return false;
    }
    public void showStatus() {
        if (alive) {
            System.out.println("-----------------------");
            System.out.println("Name        : " + name);
            System.out.println("Role        : " + role);
            System.out.println("Level       : " + level);
            System.out.println("Damage      : " + damage);
            System.out.println("Energy      : " + energy);
            System.out.println("HP          : " + hp);
            System.out.println("Money       : " + money);
            System.out.println("-----------------------");
        } else {
            System.out.printf("%s IS DEAD!", name.toUpperCase());
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void showItems() {
        int i = 0;
        for (Item item : items) {
            System.out.printf("%d. %s\n", i+1, item.getInfo());
            i++;
        }
    }

    public boolean attack(Player challenged) {
        if (alive) {
            //If the player's energy is empty then don't attack
            if (energy <= 0){
                System.out.println("You feel exhausted!");
                return false;
            }
            if (challenged.isAlive()){

                System.out.println(challenged.getDamage(damage));
                energy -= 10;
                if (!challenged.isAlive()){
                    //If the challenged player is dead then increase the current player's
                    // damage, level, and money
                    damage += 2;
                    level++;
                    money += 50;
                }
                return true;
            }
        }
        return false;
    }

    public String getDamage(double damage) {
        //Critical Damage
        double critical = ThreadLocalRandom.current().nextDouble(0, 100);
        if (critical > damage*10) { //Threshold to be considered a critical attack
            hp -= (damage + (critical/10));
        }
        hp -= damage;
        if (hp <= 0) {
            //If the opponent is dead
            alive = false;
            return String.format("%s has been killed!", name);
        } else if (critical > damage *10) {
            //Critical attack message
            return String.format("CRITICAL ATTACK! %s Received %f damage", name, damage+(critical/10));
        } else {
            //Default attack message
            return String.format("%s Received %f damage", name, damage);
        }
    }
    public void replenishEnergy() {
        if (energy < 100){
            energy += 5;
        }
    }
    public boolean healing(double health) {
        if (alive) {
            for (Item item : items) {
                if (item.getType() == 0) { // Is the item a potion?
                    hp += health;
                    item.use();
                    return true;
                }
            }
            //No more potions left in the players inventory2
            System.out.println("You don't have any potions left!");
        }
        return false; 
    }

    public boolean buy(Player merchant, int itemIndex) {
        if (alive) {
            //Checks if the player has enough money to buy the item, and checks if the item is valid
            if (money >= merchant.showItem(itemIndex).getPrice() && merchant.showItem(itemIndex).getType() != -1) {
                int emptySpotIndex = -1;
                //Checks for empty spots in the players inventory
                for (int i = 0; i < items.length; i++) {
                    if (items[i].getType() == -1) {
                        emptySpotIndex = i;
                    }
                }
                if (emptySpotIndex == -1) {
                    //if there are no empty spots, then don't buy the item
                    System.out.println("Your inventory is full!");
                    return false;
                }
                //Receives the item from the merchant
                items[emptySpotIndex] = merchant.sell(itemIndex);
                return true;
            } else if (merchant.showItem(itemIndex).getType() == -1) {
                //In case an error occurs
                System.out.println("Invalid index");
            }
        }
        return false;
    }

    private Item sell(int itemIndex) {
        //Sells the item to the buyer
        money += items[itemIndex].getPrice();
        return items[itemIndex].sell();
    }

    public Item showItem(int itemIndex) {
        return items[itemIndex];
    }

}