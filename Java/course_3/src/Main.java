public class Main {
    public static void main (String [] args) {

    Produs P1 = new Produs("Paine", 150.00, 3);
    Produs P2 = new Produs("Lapte", 10.00, 5);
    Produs P3 = new Produs("Oua", 20.00, 10);
    System.out.println(P1.pret);
    P1.calculeazaReducere();
    System.out.println(P1.pret);
    P2.calculeazaReducere();
    P3.calculeazaReducere();
    System.out.println(P1.numarRaion);
    P1.modificaRaion(7);
    System.out.println(P1.numarRaion);

    }
}