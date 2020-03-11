import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        Player player1 = new Player(1, 100, 3000, 0);
        player1.setName("Swordman");
        player1.setRole("Cave Clan");
        player1.setDamage(0);
        Player player2 = new Player(1, 100, 3000, 0);
        player2.setName("Werewolf");
        player2.setRole("Beast");
        player2.setDamage(0);
        
        // Pemilihan Hero untuk Player 1
        System.out.println("--------------- Pilih Hero ---------------");
        System.out.println("\tSwordman\tWerewolf"); 
        String choosePlayer1 = yuk.nextLine().toLowerCase();

        // Boolean di bawah untuk mengecek Pilihan Player 1 
        boolean choose1 = choosePlayer1.contains("swordman");
        System.out.println();
        
        // Kondisi dimana Player 1 memilih Swordman
        if (choose1) {
            player1.showStatus();
            System.out.println();
        }
        // Kondii dimana Player 1 memilih Werewolf
        else {
            player2.showStatus();
            System.out.println();
        }

        // Pemilihan Hero untuk Player 2
        System.out.println("--------------- Pilih Hero ---------------");
        System.out.println("\tSwordman\tWerewolf");
        String choosePlayer2 = yuk.nextLine();
        choosePlayer2 = choosePlayer2.toLowerCase();
        // Boolean di bawah untuk mengecek pilihan dari Player 2
        boolean choose2 = choosePlayer2.contains("swordman");
        System.out.println();
        
        // Kondisi dimana Player 2 memilih Swordman
        if (choose2) {
            player1.showStatus();
            System.out.println();
        }
        // Kondisi dimana Player 2 memilih Werewolf
        else {
            player2.showStatus();
            System.out.println();
        }
        
        boolean loop = false;
        int i = 0;
        // Infinity Loop untuk mensimulasikan pertarungan dari para Player
        while(true) {
            i++;
            if (i == 1) {
                // Kondisi dimana Player 1 memulai giliran
                if (loop == false) {
                    System.out.println("------------- Player 1 --------------");
                    System.out.println("\tAttack\t\tHealing\n\t\tItems");
                    String chooseActPlayer1 = yuk.nextLine().toLowerCase();

                    // Boolean di bawah untuk mengecek pilihan dari Player1
                    boolean actAttack = chooseActPlayer1.contains("attack");
                    boolean actHealing = chooseActPlayer1.contains("healing");
                    boolean actItems = chooseActPlayer1.contains("items");

                    // Kondisi dimana Player 1 memilih untuk menyerang
                    if (actAttack) {
                        player1.attack(player2);
                        player2.getDamage(player1);
                        System.out.println("------ Status Player 1 ------");
                        player1.showStatus();
                        System.out.println();
                        System.out.println("------ Status Player 2 ------");
                        player2.showStatus();
                        System.out.println();
                    }
                    // Kondisi dimana Player 1 memilih untuk Menambah Darah
                    else if (actHealing) {
                        player1.healing();
                        System.out.println("------ Status Player 1 ------");
                        player1.showStatus();
                        System.out.println();
                        System.out.println("------ Status Player 2 ------");
                        player2.showStatus();
                        System.out.println();
                    }
                    // Kondisi dimana Player 1 memilih Items 
                    else if (actItems) {
                        System.out.println("Shop");
                        player1.showItems();
                        System.out.println("Buy some Items?");
                        String choose = yuk.nextLine().toLowerCase();
                        
                        // Boolean di bawah untuk mengecek Pilihan Player 1
                        boolean answer = choose.contains("yes");
                        // Kondisi dimana Player 1 memilih untuk membeli Items
                        if (answer) {
                            System.out.println("What do you want to buy?");
                            String chooseItems = yuk.nextLine().toLowerCase();

                            // Boolean di bawah untuk mengecek pilihan Player 1
                            boolean answerItems1 = chooseItems.contains("mango");
                            boolean answerItems2 = chooseItems.contains("eye of skadi");
                            boolean answerItems3 = chooseItems.contains("eaglesong");
                            // Kondisi dimana Player 1 membeli Mango
                            if (answerItems1) {
                                player1.buyMango(player1, 1);
                                player1.showMyItems();
                            }
                            // Kondisi dimana Player 1 membeli Eye Of Skadi
                            else if (answerItems2) {
                                player1.buyEyeOfSkadi(player2, 1);
                                player1.showMyItems();
                            } 
                            // Kondisi dimana Player 1 membeli Eaglesong
                            else if (answerItems3) {
                                player1.buyEaglesong(player1, 1);
                                player1.showMyItems();
                            }
                        // Kondisi dimana Player 1 tidak ingin membeli items
                        } else {
                            System.out.println("Sell your items?");
                            String sellItems = yuk.nextLine().toLowerCase();
                            
                            // Boolean di bawah untuk mengecek pilihan Player 1
                            boolean answerSell = sellItems.contains("yes");
                            // Kondisi dimana Player 1 memilih untuk menjual Itemnya
                            if (answerSell) {
                                System.out.println("What do you want to sell?");
                                String chooseSellItems = yuk.nextLine().toLowerCase();

                                // Boolean di bawah untuk mengecek pilihan Player 1
                                boolean answerItems1 = chooseSellItems.contains("mango");
                                boolean answerItems2 = chooseSellItems.contains("eye of skadi");
                                boolean answerItems3 = chooseSellItems.contains("eaglesong");
                                // Kondisi dimana Player 1 Menjual Item Mango
                                if (answerItems1) {
                                    player1.sellMango(0);
                                    player1.showMyItems();
                                }
                                // Kondisi dimana Player 1 Menjual Item Eye Of Skadi  
                                else if (answerItems2) {
                                    player1.sellEyeOfSkadi(0, player2);
                                    player1.showMyItems();
                                }
                                // Kondisi dimana Player 1 Menjua; Item Eaglesong 
                                else if (answerItems3) {
                                    player1.sellEaglesong(0);
                                    player1.showMyItems();
                                }
                            }
                        }
                    }
                    // Loop bernilai true agar kondisi yang di bawah terpenuhi
                    loop = true;
                // Kondisi dimana Player 2 memulai giliran
                } else {
                    System.out.println("------------- Player 2 --------------");
                    System.out.println("\tAttack\t\tHealing\n\t\tItems");
                    String chooseActPlayer2 = yuk.nextLine().toLowerCase();

                    // Boolean di bawah untuk mengecek pilihan Player 2
                    boolean actAttack = chooseActPlayer2.contains("attack");
                    boolean actHealing = chooseActPlayer2.contains("healing");
                    boolean actItems = chooseActPlayer2.contains("items");
                    // Kondisi dimana Player 2 memilih Attack
                    if (actAttack) {
                        player2.attack(player1);
                        player1.getDamage(player2);
                        System.out.println("------ Status Player 1 ------");
                        player1.showStatus();
                        System.out.println();
                        System.out.println("------ Status Player 2 ------");
                        player2.showStatus();
                        System.out.println();
                    }
                    // Kondisi dimana Player 2 memilih Healing 
                    else if (actHealing) {
                        player2.healing();
                        System.out.println("------ Status Player 1 ------");
                        player1.showStatus();
                        System.out.println();
                        System.out.println("------ Status Player 2 ------");
                        player2.showStatus();
                        System.out.println();
                    }
                    // Kondisi dimana Player 2 memilih Items 
                    else if (actItems) {
                        player2.showItems();
                        System.out.println("Buy some Items?");
                        String choose = yuk.nextLine().toLowerCase();

                        // Boolean di bawah untuk mengecek pilihan Player 2
                        boolean answer = choose.contains("yes");
                        // Kondisi dimana Player memilih untuk membeli Items
                        if (answer) {
                            System.out.println("What do you want to buy?");
                            String chooseItems = yuk.nextLine().toLowerCase();
                            
                            // Boolean di bawah untuk mengecek pilihan Player 2
                            boolean answerItems1 = chooseItems.contains("mango");
                            boolean answerItems2 = chooseItems.contains("eye of skadi");
                            boolean answerItems3 = chooseItems.contains("eaglesong");
                            // Kondisi dimana Player 2 membeli Mango
                            if (answerItems1) {
                                System.out.println();
                                player2.buyMango(player2, 1);
                                player2.showMyItems();
                                System.out.println();
                            }
                            // Kondisi dimana Player 2 membeli Eye Of Skadi 
                            else if (answerItems2) {
                                System.out.println();
                                player2.buyEyeOfSkadi(player1, 1);
                                player2.showMyItems();
                                System.out.println();
                            }
                            // Kondisi dimana Player 2 membeli Eaglesong 
                            else if (answerItems3) {
                                System.out.println();
                                player2.buyEaglesong(player2, 1);
                                player2.showMyItems();
                                System.out.println();
                            }
                        // Kondisi dimana Player 2 memilih untuk tidak membeli Items
                        } else {
                            System.out.println("Sell your items?");
                            String sellItems = yuk.nextLine().toLowerCase();

                            // Boolean di bawah untuk mengecek pilihan Player 2
                            boolean answerSell = sellItems.contains("yes");
                            // Kondisi dimana Player 2 memilih untuk menjual Items
                            if (answerSell) {
                                System.out.println("What do you want to sell?");
                                String chooseSellItems = yuk.nextLine().toLowerCase();
                                
                                // Boolean di bawah untuk mengecek pilihan Player 2
                                boolean answerItems1 = chooseSellItems.contains("mango");
                                boolean answerItems2 = chooseSellItems.contains("eye of skadi");
                                boolean answerItems3 = chooseSellItems.contains("eaglesong");
                                // Kondisi dimana Player 2 menjual Items Mango
                                if (answerItems1) {
                                    player2.sellMango(0);
                                    player2.showMyItems();
                                }
                                // Kondisi dimana Player 2 menjual Items Eye of Skadi 
                                else if (answerItems2) {
                                    player2.sellEyeOfSkadi(0, player1);
                                    player2.showMyItems();
                                }
                                // Kondisi dimana Player 2 menjual Items Eaglesong 
                                else if (answerItems3) {
                                    player2.sellEaglesong(0);
                                    player2.showMyItems();
                                }
                            }
                        }
                    }
                    // Loop bernilai false agar kondisi dimana Player 1 memulai giliran itu terpenuhi
                    loop = false;
                }
            // Kondisi dimana Infinity Loop akan Berhenti
            } else {
                // Kondisi saat Player menyentuh Hp = 0
                if (player1.dead(player2) || player2.dead(player1)) {
                    // Kondisi dimana Player 2 Mati
                    if (player1.dead(player2)) {
                        System.out.println();
                        System.out.println(player1.getName() + " Win");
                        System.out.println(player2.getName() + " Death");
                    }
                    // Kondisi dimana Player 1 Mati
                    else{
                        System.out.println();
                        System.out.println(player2.getName() + " Win");
                        System.out.println(player1.getName() + " Death");
                    }
                    break;
                }
            }
        }
        yuk.close();
    }
}