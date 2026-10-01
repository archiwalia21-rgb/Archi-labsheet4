class FibonacciQ24 {
    static int seriesCount = 0;

    void display(int n) {
        int first = 0;
        int second = 1;
        int next;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
    }

    public static void main(String[] args) {
        FibonacciQ24 f = new FibonacciQ24();
        f.display(7);

        System.out.println();
        System.out.println("Series Count: " + seriesCount);
    }
}
