import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
class Player {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List <Item> items;
    private List <Item> blankItems;
    
    public Player(int level, double hp, int money, double energy) {
        this.level = level;
        this.hp = hp;
        this.money = money;
        this.energy = energy;
        items = new ArrayList<>();
        blankItems = new ArrayList<>();
        items.add(new Item("Mango", 200, " +20 Energy"));
        items.add(new Item("Eye of Skadi", 500, " Reduce 5 Damage"));
        items.add(new Item("Eaglesong", 500, " +10 Damage"));
    }
    public List<Item> getItem() {
        return items;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setDamage(double damage) {
        this.damage = ThreadLocalRandom.current().nextDouble(10, 20);
    }
    public void healing() {
        if(hp == 100) {
            System.out.println("HP sudah penuh");
        }
        if (energy == 100) {
            if (hp < 100) {
                hp = 100;
            }
        }
    }
    public void attack(Player enemy) {
        energy += 20;
        level += 1;
    }
    public void getDamage(Player enemy) {
        hp = hp - damage;
    }
    public double getAttackPower(Player player) {
        return player.damage -= 5;
    }
    public boolean dead(Player player) {
        if (player.hp <= 0){
            return true;
        } else { 
            return false;
        }
    }
    public void showItems() {
        System.out.println();
        for (int i = 0; i < items.size(); i++) {
            Item.descItem(items.get(i));
            System.out.println();
        }
        System.out.println();
    }
    public void buyMango(Player player, int count) {
        if(!dead(player)){
            if (money >= 500) {
                for (int i = 0; i < count; i++) {
                    blankItems.add(new Item("Mango", 500, "+20 Energy"));
                    energy += 20;
                    money -= 500;
                }
            } else {
                System.out.println();
                System.out.println("You dont have money");
            }
        }
    }
    public void buyEyeOfSkadi(Player player, int count) {
        if(!dead(player)){
            if (money >= 2000) {
                for (int i = 0; i < count; i++) {
                    blankItems.add(new Item("Eye Of Skadi", 2000, "Reduce 5 Damage"));
                    player.getAttackPower(player);
                    money -= 2000;
                }
            } else {
                System.out.println();
                System.out.println("You dont have money");
            }
        }
    }
    public void buyEaglesong(Player player, int count) {
        if(!dead(player)){
            if (money >= 1000) {
                for (int i = 0; i < count; i++) {
                    blankItems.add(new Item("Eaglesong", 1000, " +10 Damage"));
                    damage += 10;
                    money -= 1000;
                }
            } else {
                System.out.println();
                System.out.println("You dont have money");
            }
        }
    }
    public void showMyItems() {
        System.out.println();
        System.out.println("Your Items");
        for (int i = 0; i < blankItems.size(); i++) {
            // System.out.println();
            Item.descMyItem(blankItems.get(i));
            System.out.println();
        }
    }
    public void sellMango(int count) {
        if (blankItems == null) {
            System.out.println("You have to buy some items");
        } else {
            blankItems.remove(count);
            energy += 20;
            money += 200;
        }
    }
    public void sellEyeOfSkadi(int count, Player enemy) {
        if (blankItems == null) {
            System.out.println("You have to buy some items");
        } else {
            blankItems.remove(count);
            enemy.damage += 5;
            money += 500;
        }
    }
    public void sellEaglesong(int count) {
        if (blankItems == null) {
            System.out.println("You have to buy some items");
        } else {
            blankItems.remove(count);
            damage -= 10;
            money += 500;
        }
    }
    void showStatus() {
        if (hp < 0) {
            hp = 0;
            System.out.println("Player      = "+ getName());
            System.out.println("Role        = "+ getRole());
            System.out.println("Level       = "+ level);
            System.out.printf("Hp          = %.0f\n", hp);
            System.out.printf("Damage      = %.0f\n", damage);
            System.out.println("Energy      = "+ energy);
            System.out.println("Money       = "+ money);
        } else {
            System.out.println("Player      = "+ getName());
            System.out.println("Role        = "+ getRole());
            System.out.println("Level       = "+ level);
            System.out.printf("Hp          = %.0f\n", hp);
            System.out.printf("Damage      = %.0f\n", damage);
            System.out.println("Energy      = "+ energy);
            System.out.println("Money       = "+ money);
        }
    }
}