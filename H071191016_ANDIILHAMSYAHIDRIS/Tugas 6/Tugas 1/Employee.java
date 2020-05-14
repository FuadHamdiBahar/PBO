
class Employee {

    private String name;

    Employee(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return 2500000;
    }
    void printInfo()
    {
        System.out.println(name +" mendapatkan gaji Rp."+ getSalary());
    }
}