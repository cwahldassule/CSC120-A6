/* This is a stub for the Cafe class */
public class Cafe {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(int coffee, int sugar, int cream, int cups) {
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(size > this.nCoffeeOunces | nSugarPackets > this.nSugarPackets | nCreams > this.nCreams | nCups == 0){
            System.out.println("Restocking...");
            this.restock(20, 10, 10,10);}
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    public void printInvt(){
        System.out.println("Coffee "+nCoffeeOunces);
        System.out.println("Suagar "+nSugarPackets);
        System.out.println("Cream "+nCreams);
        System.out.println("Cups "+nCups);
    }

    public static void main(String[] args) {
        Cafe campus = new Cafe(400, 200, 200, 200);
        campus.sellCoffee(100, 2, 2);
        campus.printInvt();
        campus.sellCoffee(12, 2, 2);
        campus.printInvt();

    }
    
}
