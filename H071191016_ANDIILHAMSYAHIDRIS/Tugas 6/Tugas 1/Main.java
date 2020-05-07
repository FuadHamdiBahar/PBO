import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Staf         ::> ");
        String stafName = scan.nextLine();
        System.out.print("Jumlah Kehadiran  ::> ");
        int presence = scan.nextInt();
        System.out.print("Nama Dosen        ::> ");
        String lecturerName = scan.next();
        System.out.print("Jumlah SKS        ::> ");
        int sks = scan.nextInt();
        System.out.print("Nama Pegawai      ::> ");
        String employeeName = scan.next();

        Employee [] employee = new Employee[3];
        employee[0] = new Staf(stafName, presence);
        employee[1] = new Lecturer(lecturerName, sks);
        employee[2] = new Employee(employeeName);
        

        for (int i = 0; i < employee.length; i++)
        {
            employee[i].getSalary();
            employee[i].printInfo();
        }

    scan.close();
    }
}