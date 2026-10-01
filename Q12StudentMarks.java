class StudentMarksQ12 {
    int marks1, marks2, marks3;
    static String universityName = "COER University";

    void average() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        StudentMarksQ12 s = new StudentMarksQ12();
        s.marks1 = 80;
        s.marks2 = 70;
        s.marks3 = 90;
        s.average();
    }
}

