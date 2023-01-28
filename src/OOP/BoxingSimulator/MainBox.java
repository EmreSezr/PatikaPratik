public class MainBox {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Khabib", 15, 100, 90, 0,0);
        Fighter fighter2 = new Fighter("Connor", 10, 95, 100, 0,1);
        Ring r = new Ring(fighter1, fighter2, 90, 100);
        r.run();
    }
}


