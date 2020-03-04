class Main2 {
    public static void main(String[] args) {
        int defence = 15;
        int attack = 30;

        Player player1 = new Player("Mino", attack, defence);
        Player player2 = new Player("Hilda", defence);
        player2.setAttackPower(35);
        player1.getDamage(player2);
        player2.getDamage(player1);
        player1.status();
        System.out.println();
        player2.status();
    }
}