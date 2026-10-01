class ElectricBillQ18 {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        int usedUnits = units;
        double bill;

        if (usedUnits <= 100)
            bill = usedUnits * 5;
        else if (usedUnits <= 200)
            bill = 100 * 5 + (usedUnits - 100) * 7;
        else
            bill = 100 * 5 + 100 * 7 + (usedUnits - 200) * 10;

        double totalBill = bill + fixedCharge;

        System.out.println("Units: " + usedUnits);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBillQ18 e = new ElectricBillQ18();
        e.units = 150;
        e.calculateBill();
    }
}
