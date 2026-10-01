class FactorialQ25 {
    static int totalCalls = 0;

    void calculate(int number) {
        int n = number;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        FactorialQ25 f = new FactorialQ25();
        f.calculate(5);

        System.out.println("Total Calls: " + totalCalls);
    }
}
