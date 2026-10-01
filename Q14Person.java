class PersonQ14 {
    String name;
    int age;
    static String country = "India";

    void checkEligibility() {
        int personAge = age;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (personAge >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

    public static void main(String[] args) {
        PersonQ14 p = new PersonQ14();
        p.name = "Archi";
        p.age = 19;
        p.checkEligibility();
    }
}
