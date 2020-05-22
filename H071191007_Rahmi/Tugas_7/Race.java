import java.util.concurrent.CopyOnWriteArrayList;

public class Race {
    int numberOfRunner;
    CopyOnWriteArrayList <String> participants = new CopyOnWriteArrayList<>();
    boolean started = false;

    public void start() {
        if(numberOfRunner >= 3) {
            started = true;
            System.out.println("The race starts . . .");
        }
        else {
            System.out.println("The race cannot be started , runners are not enough");
        }
    }

    public void result() {
        try {
			Thread.sleep(numberOfRunner * 1000);
        } catch (InterruptedException e)  {
			e.printStackTrace();
        }
        while(participants.size() != numberOfRunner) {
            continue;
        }

        System.out.println("1st : " + participants.get(0));
        System.out.println("2nd : " + participants.get(1));
        System.out.println("3rd : " + participants.get(2));

        for(int i = 3; i < participants.size(); i++) {
            System.out.println(participants.get(i) + " lose");
        }

    }

}
