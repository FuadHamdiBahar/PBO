class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defence;

    public Player(String name, int defence) {
        this.name = name;
        this.defence = defence;
        hp = 100;
    }
    public Player(String name, int attack, int defence) {
        this.name = name;
        this.attackPower = attack;
        this.defence = defence;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public void getDamage(Player enemy) {
        hp = hp - (defence - enemy.getAttackPower());
    }
    public void status() {
        System.out.println(name + " Status");
        System.out.println("HP = "+ hp);
        System.out.println("Defence = "+ defence);
        System.out.println("Attack = "+ attackPower);
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return hp - 30;
    }
    
    
    
}