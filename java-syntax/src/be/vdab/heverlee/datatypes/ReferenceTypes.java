package be.vdab.heverlee.datatypes;

public class ReferenceTypes {
    public static void main(String[] args) {
        int oG = 3;
        System.out.println("Original number: " + oG);

        System.out.println("ctrl+c to twin:");
        int twin = oG;
        System.out.println("OG: " + oG);
        System.out.println("Twin: " + twin);

        System.out.println("changing the twin: ");
        twin = -15;
        System.out.println("OG(same): " + oG);
        System.out.println("Twin: " + twin);

        Sheep sheepOG = new Sheep("AlphaSchaap");
        System.out.println("OG naam: " + sheepOG.getName());

        Sheep sheepDolly = sheepOG;
        System.out.println("Twin niet clone (is same adress enfin): " + sheepDolly.getName());
        sheepDolly.setName("Dolly");
        System.out.println("Kijk eens waar het om ging: " + sheepOG.getName() + "\n" + sheepDolly.getName());

        //todo 1 change verandert het geadresseerde Maar geen clone
    }
}
