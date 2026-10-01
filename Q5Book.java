class Q5Book {
    String title, author;
    double price;
    static String publisher = "Penguin";

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Q5Book b = new Q5Book();
        b.title = "Java Basics";
        b.author = "James";
        b.price = 450;
        b.display();
    }
}