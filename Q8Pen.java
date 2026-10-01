class PenQ8 {
    String color;
    String type;
    static String manufacturer = "Cello";

    void display() {
        String penColor = color;
        String penType = type;

        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        PenQ8 p = new PenQ8();
        p.color = "Blue";
        p.type = "Ball Pen";
        p.display();
    }
}