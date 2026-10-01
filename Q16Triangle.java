class TriangleQ16 {
    int a, b, c;
    static String type = "Triangle";

    void checkValidity() {
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);

        if (valid) {
            if (a == b && b == c)
                type = "Equilateral";
            else if (a == b || b == c || a == c)
                type = "Isosceles";
            else
                type = "Scalene";

            System.out.println("Valid Triangle");
            System.out.println("Type: " + type);
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        TriangleQ16 t = new TriangleQ16();
        t.a = 5;
        t.b = 5;
        t.c = 6;
        t.checkValidity();
    }
}