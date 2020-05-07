class Lecturer extends Employee {

    private String name;
    private int sks;

    Lecturer(String name, int sks)
    {
        super(name);
        this.name = name;
        this.sks = sks;
    }
    public String getName()
    {
        return name;
    }
    public int getSks()
    {
        return sks;
    }
    @Override
    public int getSalary()
    {
        return (sks * 250000) + 2500000;
    }
    @Override
    void printInfo()
    {
        System.out.println(name + " mendapatkan gaji Rp."+ getSalary());
    }

}