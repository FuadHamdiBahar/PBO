import java.util.List;
import java.util.Scanner;

class Player {

    static Scanner input = new Scanner(System.in);

    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private Items[] items = new Item[] { new Item("Sword", 3000, " +20 Damage Fire "),
            new Item("Throwing Knives", 2000, "+15 Damage Slash") };

    public Player(String name, String role, int level, double hp, double damage, int money, double energy) {
        this.hp = hp;
        this.money = money;
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.energy = energy;

    }

    public Double getEnergy() {
        return energy;
    }

    public Double getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Double getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public boolean healing(double hp) {
        player.hp = this.hp;
        return true;
    }

    public boolean attack(Player player) {
        player.hp -= this.damage;
        return true;
    }

    public boolean buy(Item items) {
        if (money < price) {
            money = this.money - price;
            return true;
        }
        int a = input.nextInt();
        if (a == 1) {

        }
    }

    public void sell() {
        if (money > price) {
            money = this.money + items[0].getPrice();
        }
    }

    public void showStatus() {
        System.out.println("Name    : " + getName());
        System.out.println("Role    : " + getRole());
        System.out.println("Money   : " + getMoney());
        System.out.println("Hp      : " + getHp());
        System.out.println("Energy  : " + getEnergy());
        System.out.println("Level   : " + getLevel());
        System.out.println("Damage  : " + getDamage());
        System.out.println("");
    }

    public void showItem() {
        System.out.println("List Item");
        System.out.println();
    }
}
