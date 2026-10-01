class PrimeCheckerQ23 {
    static int totalPrimeChecks = 0;

    void check(int number) {
        int divisorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                divisorCount++;
        }

        totalPrimeChecks++;

        if (divisorCount == 2)
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is not Prime");
    }

    public static void main(String[] args) {
        PrimeCheckerQ23 p = new PrimeCheckerQ23();
        p.check(17);
        System.out.println("Total Prime Checks: " + totalPrimeChecks);
    }
}
