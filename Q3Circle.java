class Q3Circle {
    double radius;
    static double PI = 3.14;

    void calculate() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Q3Circle c = new Q3Circle();
        double r = 5;
        c.radius = r;
        c.calculate();
    }
}
