class LaptopQ9 {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        LaptopQ9 l = new LaptopQ9();
        l.brand = "HP";
        l.RAM = 8;
        l.display();
    }
}