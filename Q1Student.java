public class Q1Student {
    String name;
    int age;
    static int count = 0;

    void setDetails(String n, int a) {
        String studentName = n;  // local variable
        int studentAge = a;      // local variable

        name = studentName;
        age = studentAge;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Q1Student s1 = new Q1Student();
        Q1Student s2 = new Q1Student();

        s1.setDetails("Archi", 19);
        s2.setDetails("Riya", 20);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}