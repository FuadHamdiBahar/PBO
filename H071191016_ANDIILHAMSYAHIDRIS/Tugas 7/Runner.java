class Runner implements Runnable {

    private Integer number;
    private Thread thread;
    private Race race;

    public Runner(Integer number)
    {
        this.number = number;
    }

    public Runner joinRace(Race race)
    {
        if (this.race == null)
        {
            this.race = race;
            thread = new Thread(this);
            race.numberOfRunner++;
            thread.setName("Runner -"+ number);
        }
        return this;
    }
    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName() + " running . . .");

        try 
        {
            Thread.sleep(race.numberOfRunner * 1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        synchronized(race.participants)
        {
            race.participants.add(Thread.currentThread().getName());
        }
    }
    public void start()
    {
        if(thread != null && race.started)
        {
            thread.start();
        }
        else if(thread == null)
        {
            System.out.println(thread.getName() + " have not entered any race");
        }
        else if(!race.started)
        {
            System.out.println("Hey " + thread.getName() + ", the race hasn't started yet");
        }
    }
}