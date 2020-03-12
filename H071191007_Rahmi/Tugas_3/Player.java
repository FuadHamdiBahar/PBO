import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List<Item> items;

    public Player(String name, String role) {
        items = new ArrayList<>();
        this.name = name;
        this.role = role;
        level = 1;
        damage = 10;
        hp = 100;
        energy = 100;
        money = 1000;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getLevel() {
        return level;
    }

    public void showStatus() {
        System.out.println("Name\t : " + name);
        System.out.println("Role\t : " + role);
        System.out.println("Level\t : " + level);
        System.out.println("Damage\t : " + damage);
        System.out.println("Hp\t : " + hp);
        System.out.println("Energy\t : " + energy);
        System.out.println("Money\t : " + money);
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).descItem();
        }
    }

    public void attack(Player player) {
        player.hp -= damage;
        energy -= 10;
    }

    public boolean mati(Player enemy) {
        if (enemy.hp <= 0) {
            System.out.println(enemy.name + "mati");
            return true;
        }
        return false;
    }

    public void healing() {
        if (money >= 50) {
            hp += 10;
            money -= 50;
        } else {
            System.out.println("de nagenne dui mul" + name);
        }
    }

    public void buy() {
        System.out.println("--Item 1--");
        System.out.println("Yellow Power");
        System.out.println("$ 100");
        System.out.println("");
        System.out.println("--Item 2--");
        System.out.println("Pink Power");
        System.out.println("$ 120");
        System.out.println("");
        System.out.println("--Item 3--");
        System.out.println("Blue Power");
        System.out.println("$ 130");
        System.out.println("");

        Scanner ra = new Scanner(System.in);

        System.out.println("Pilih Barang");
        int apa = ra.nextInt();

        if (apa == 1) {
            System.out.println(name + " have yellow power!");
            items.add(new Item("Ramuan Kuning", 100, "menambah hp"));
            money -= 100;
        } else if (apa == 2) {
            System.out.println(name + " have pink power!");
            items.add(new Item("Ramuan Pink", 120, "menambah damage"));
            money -= 120;
        } else if (apa == 3) {
            System.out.println(name + " have blue power!");
            items.add(new Item("Ramuan Biru", 130, "menambah uang"));
            money -= 130;
        }
    }
}
