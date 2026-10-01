class ArmstrongQ22 {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int sum = 0;
        int digit;

        while (temp > 0) {
            digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }

    public static void main(String[] args) {
        ArmstrongQ22 a = new ArmstrongQ22();
        a.check(153);
        System.out.println("Total Checks: " + totalChecks);
    }
}
