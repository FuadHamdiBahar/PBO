
class Staf extends Employee{

    private String name;
    private int presence;

    Staf(String name, int presence)
    {
        super(name);
        this.name = name;
        this.presence = presence;
    }
    public String getName()
    {
        return name;
    }
    public int getPresence()
    {
        return presence;
    }
    @Override
    public int getSalary()
    {
        return (presence * 150000) + 2500000;
    }
    @Override
    void printInfo()
    {
        System.out.println();
        System.out.println(name +" mendapatkan gaji Rp."+ getSalary());
    }
}