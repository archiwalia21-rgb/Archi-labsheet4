class Q6Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Q6Car c = new Q6Car();
        c.brand = "Toyota";
        c.mileage = 20.5;
        c.display();
    }
}
