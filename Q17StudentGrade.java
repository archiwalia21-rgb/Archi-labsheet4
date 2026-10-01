class StudentGradeQ17 {
    String name;
    int marks;
    static int passingMarks = 40;

    void grade() {
        int studentMarks = marks;
        char grade;

        if (studentMarks >= 90)
            grade = 'A';
        else if (studentMarks >= 75)
            grade = 'B';
        else if (studentMarks >= 60)
            grade = 'C';
        else if (studentMarks >= passingMarks)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGradeQ17 s = new StudentGradeQ17();
        s.name = "Archi";
        s.marks = 85;
        s.grade();
    }
}