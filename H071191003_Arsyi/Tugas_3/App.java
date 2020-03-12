import java.util.Scanner;
public class App {
    private static Player[] players;
    private static final Scanner input = new Scanner(System.in);
    private static int playersAlive;
    public static void main(String[] args) {
        
        boolean win = false;

        System.out.print("Input number of players : ");
        players = new Player[input.nextInt()];
        playersAlive = players.length;
        input.nextLine();
        for (int i = 0; i < players.length; i++) {
            System.out.printf("Input player %d's name : ", i+1);
            String name = input.nextLine();
            System.out.printf("Input player %d's role : ", i+1);
            String role = input.nextLine();
            players[i] = new Player(name, role);
        }
        while (!win) {
            for (Player player : players) {
                if (player.isAlive()){
                    actions(player);
                    if (playersAlive <= 1) { //if only one player is remaining, then game over
                        win = true;
                    }
                }
            }
        }
        System.out.println("GAME OVER!");
        for (Player player: players) {
            if (player.isAlive()) {
                System.out.printf("%s WON!", player.getName());
            }
        }
    }
        

    
    private static boolean market(Player merchant, Player customer) {
        while (true) {
            showPlayerItems(merchant);
            System.out.println("4. Cancel");
            System.out.println("-----------------------");
            int choice = input.nextInt()-1;
            if (choice == 3) { //If the player decides to cancel trade
                System.out.println("Transaction canceled by user!");
                return false;
            } else if (choice > 3 || choice < 0) {
                System.out.println("Invalid item index!");
                continue;
            }
            if (customer.buy(merchant, choice)) {
                break;
            }
        }
        return true;


    }

    private static boolean duelArena(Player challenger,Player challenged) {
        if (!challenger.attack(challenged)){ //if the player decided to cancel his/her attack
            return false;
        }
        if (!challenged.isAlive()) {
            //If challenged is dead then increase the number of dead players
            playersAlive--;
        }
        return true;
    }
    
    private static void actions(Player player) {
        boolean turnIsOver = false;
        player.replenishEnergy();
        while (!turnIsOver) {
            //Show the players options
            System.out.printf("%s's turn!\n", player.getName());
            System.out.println("Actions : ");
            System.out.println("1. Show Status");
            System.out.println("2. Show Items");
            System.out.println("3. Attack");
            System.out.println("4. Heal");
            System.out.println("5. Trade");
            System.out.println("6. Use Sword");
            System.out.println("7. Skip");
            System.out.print("Choice : ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1){ //Show player's status
                player.showStatus();
            } else if (choice == 2) { //Show player's items
                showPlayerItems(player);
                System.out.println("-----------------------");
            } else if (choice == 3) { //Attack another player
                System.out.println("Attack : ");
                int playerIndex = getPlayer(player);
                if (!validPlayerIndex(playerIndex)) {
                    continue;
                }
                turnIsOver = duelArena(player, players[playerIndex]); //If attack is successful then end turn
            } else if (choice == 4) { //Heal
                turnIsOver = player.healing(20);
            } else if (choice == 5) { //Trade with another player
                System.out.println("Trade with : ");
                int playerIndex = getPlayer(player);
                if (!validPlayerIndex(playerIndex)) {
                    continue;
                }
                turnIsOver = (market(players[playerIndex], player));
            } else if (choice == 6) { //Use Sword
                turnIsOver = player.useSword(); //If player used his/her sword, then end turn
            } else if (choice == 7) { //Skip turn
                turnIsOver = true;
            }
        }
    }
    public static boolean validPlayerIndex(int index) {
        return index >= 0 && index < players.length;
    }
    private static int getPlayer(Player currentPlayer) {
        int i = 1;
        //Shows the players that the player can attack/trade with
        for (Player player : players) {
            if (!player.equals(currentPlayer) && player.isAlive()) {
                System.out.printf("%d. %s\n", i, player.getName());
            } else {
                System.out.printf("%d. ----\n",i);
            }
            i++;
        }
        System.out.printf("%d. Cancel\n",i);
        int choice;
        while (true) {
            choice = input.nextInt()-1;
            if (choice == players.length) {//If player chose to cancel
              return -1;
            } else if (!(choice >= 0 && choice < players.length)){//Is the choice a valid player index?
                System.out.println("Invalid choice!");
                continue;
            }
            if (!(currentPlayer.equals(players[choice]))) {//Checks if the player is not attacking him/her-self
                if (players[choice].isAlive()){
                    //If opponent is alive then attack the opponent
                    break;
                }
            }
            System.out.println("Invalid choice");
        }
        return choice;
    }
    private static void showPlayerItems(Player player) {
        //Shows the player's items
        System.out.println("-----------------------");
        System.out.printf("%s's items : \n", player.getName() );
        System.out.println("-----------------------");
        player.showItems();
    }
}