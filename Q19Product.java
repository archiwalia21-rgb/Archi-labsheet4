class ProductQ19 {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        ProductQ19 p = new ProductQ19();
        p.id = 101;
        p.name = "Laptop";
        p.price = 50000;
        p.calculatePrice();
    }
}
    