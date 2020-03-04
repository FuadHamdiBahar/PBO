
/**
 * By Arsyi Syarief Aziz 
 * Student ID: H071191003
 *       ◁►2020◀︎▷
 */

class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    
    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.defense = defense;
        this.attackPower = attackPower;
        hp = 100;
    }

    public void getDamage(Player enemy) {
        //changed the question a bit because of a fallacy in the given question
        hp = hp - (enemy.getAttackPower() > defense ? enemy.getAttackPower() - defense : 0); 
    }
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}