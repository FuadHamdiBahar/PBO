class Employee {
    public int salary = 2500000;
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void printSalary() {
        System.out.printf("%s has a salary of Rp. %d\n", name, salary);
    }
    public void calcSalary() {

    }
}
