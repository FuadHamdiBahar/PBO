import java.util.concurrent.CopyOnWriteArrayList;
public class Race {
	public boolean isStart = false;
	public int time;
	public int participant;
	
	public CopyOnWriteArrayList<String> ranking = new CopyOnWriteArrayList<>();

	public void start() {
		if (participant >= 3) {
			System.out.println("The race starts...");
			time = participant*1000;
			isStart = true;
		} else {
			System.out.println("The race cannot be started, runners are not enough");
		}
	}

	public void result() {
		while (true) {
			if (ranking.size() == participant) {

				System.out.println();
				
				System.out.println("The race is over");
				System.out.println();
				System.out.println("1st : " + ranking.get(0));
        		System.out.println("2nd : " + ranking.get(1));
				System.out.println("3rd : " + ranking.get(2));
				
				System.out.println();

        		for(int i = 3; i < ranking.size(); i++){
            		System.out.println(ranking.get(i) + " lose");
        		}
				return;
			}
		}
		
	}
}