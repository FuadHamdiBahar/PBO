class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player (String name, int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    // lengkapi
    public Player (String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }
    public void getDemage (Player enemy) {
        if (defense > enemy.attackPower) {
            hp = 100;
        } else {
            hp = hp - (enemy.getAttackPower() - defense);  
        }
    } 
   
    public void status () {
        System.out.println(name + "status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public int getAttackPower() {
        return attackPower; 
    }
}
public class MainPlayer {
    public static void main(String[] args) {
        int defense = 15;
        int attack = 30;
        Player player1 = new Player("Mino ",attack, defense);
        Player player2 = new Player("Hilda ", defense);

        player2.setAttackPower(0);

        player1.getDemage (player2);
        player2.getDemage (player1);
        player1.status();
        player2.status();
        
    }
}