class Q4Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    void display() {
        int id = empId;
        double sal = salary;

        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Q4Employee e = new Q4Employee();
        e.empId = 101;
        e.salary = 30000;
        e.display();
    }
}
