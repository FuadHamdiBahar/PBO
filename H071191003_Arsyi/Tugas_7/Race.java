import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    public boolean isStarted = false;
    public int time;
    public int participants;
    public List<String> participantRankings = Collections.synchronizedList(new ArrayList<String>());

    public void start() {
        if (participants >= 3) {
            System.out.println("The race starts . . .");
            time = participants*1000;
            isStarted = true;
        } else {
            System.out.println("The race cannot be started: Not enough runners!");
        }
    }

    public void result() {
        while (true) {
            if (participantRankings.size() == participants){
                System.out.println("The race is over\n");
                int count = 0;
                String[] placement = {"1st","2nd","3rd"};
                for (String participantRanking : participantRankings) {
                    if (count < 3) {
                        System.out.printf("%s : %s\n",placement[count], participantRanking);
                    } else {
                        System.out.printf("%s Lost\n",participantRanking);
                    }
                    if (count ==2) {
                        System.out.println();
                    }
                    count++;
                }
                return;
            }

        }

    }

}
