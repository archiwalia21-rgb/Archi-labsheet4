class Q2Rectangle {
    int length, breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Q2Rectangle r = new Q2Rectangle();
        int l = 10;
        int b = 5;

        r.length = l;
        r.breadth = b;
        r.calculateArea();
    }
}
