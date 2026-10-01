class EmployeeQ29 {
    String name;
    double salary;
    static String organization = "ABC Company";

    void compare(EmployeeQ29 e1, EmployeeQ29 e2) {
        double salary1 = e1.salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2)
            System.out.println(e1.name + " has higher salary");
        else if (salary2 > salary1)
            System.out.println(e2.name + " has higher salary");
        else
            System.out.println("Both have equal salary");
    }

    public static void main(String[] args) {
        EmployeeQ29 e1 = new EmployeeQ29();
        e1.name = "Archi";
        e1.salary = 40000;

        EmployeeQ29 e2 = new EmployeeQ29();
        e2.name = "Riya";
        e2.salary = 35000;

        e1.compare(e1, e2);
    }
}
