import java.util.*;

class Main {
  public static void main(String[] args) {
    Player char1 = new Player("Didi", "Male", 1, 100, 10, 5000, 100.00);
    Player char2 = new Player("Devon", "Male", 1, 100, 10, 4500, 100.00);
    while (true) {
      System.out.println("1. attack");
      System.out.println("2. heal");
      System.out.println("3. showStatus");
      System.out.println("4. showItem");
      System.out.println("5. Sell");
      Scanner scan = new Scanner(System.in);
      int p = scan.nextInt();
      if (p == 1) {
        char1.attack(char2);
      } else if (p == 2) {
        char1.healing(100);
      } else if (p == 3) {
        char1.showStatus();
      } else if (p == 4) {
        char1.showItem();
      } else if (p == 5) {
        char1.sell();

      }
      if (p == 1) {
        char2.attack(char1);
      } else if (p == 2) {
        char2.healing(100);
      } else if (p == 3) {
        char2.showStatus();
      } else if (p == 4) {
        char2.showItem();
      }
    }

  }

}