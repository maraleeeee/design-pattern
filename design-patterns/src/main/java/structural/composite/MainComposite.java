package structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        System.out.println("Composite");

        State tehran = new State("Tehran");
        City robat = new City("Robat Karim");
        MegaCity tehranMC = new MegaCity("Tehran");
        for (int i = 1; i < 23; i++) {
            tehranMC.add(new Area("Area " + i));
        }
        tehran.add(robat);
        tehran.add(tehranMC);

        tehran.print();
    }
}
