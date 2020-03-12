import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alika", "ulat bulu");
        Player player2 = new Player("Caca" , "ulat mulus");

        Scanner ra = new Scanner(System.in);

        boolean giliran = true;

        while(true) {
            System.out.println("---START GAME---");
            if (giliran) {
                System.out.println("Giliran " + player1.getName());
                System.out.println("1. Attack");
                System.out.println("2. Buy");
                System.out.println("3. Healing");
                System.out.println("4. Status");
                System.out.println("5. Items");
                int in = ra.nextInt();
                if (in == 1) {
                    giliran = false;
                    player1.attack(player2);
                    if (player1.mati(player2)) {
                        return;
                    }
                } else if (in == 2) {
                    giliran = false;
                    player1.buy();
                } else if (in == 3) {
                    giliran = false;
                    player1.healing();
                } else if (in == 4) {
                    player1.showStatus();
                } else if (in == 5) {
                    player1.showItems();
                }
            } else {
                System.out.println("Giliran " + player2.getName());
                System.out.println("1. Attack");
                System.out.println("2. Buy");
                System.out.println("3. Healing");
                System.out.println("4. Status");
                System.out.println("5. Items");

                int in = ra.nextInt();
                if (in == 1) {
                    giliran = true;
                    player2.attack(player1);
                    if (player2.mati(player1)) {
                        return;
                    }
                } else if (in == 2) {
                    giliran = true;
                    player2.buy();
                } else if (in == 3) {
                    giliran = true;
                    player2.healing();
                } else if (in == 4) {
                    player2.showStatus();
                } else if (in == 5) {
                    player2.showItems();
                }
            }  
        }
    }        
}