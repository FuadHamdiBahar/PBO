public class Runner implements Runnable {

    private int number;
    private Thread thread;
    private Race race;

    Runner(int number) {
        this.number = number;
    }
    
    public Runner joinRace(Race race) {
        if(this.race == null) {
            this.race = race;
            thread = new Thread(this);
            race.numberOfRunner++;
            thread.setName("Runner-" + number);
        }

        return this;
    }

    public void start() {
        if(thread != null && race.started){
            thread.start();
        }
        else if(thread == null) {
            System.out.println(thread.getName() + " have not entered any race");
        }
        else if(!race.started) {
            System.out.println("Hey " + thread.getName() + ", the race hasn't started yet");
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running . . .");

        try 
        {
            Thread.sleep(race.numberOfRunner * 1000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized(race.participants) {
            race.participants.add(Thread.currentThread().getName());
        }

    }
    
}