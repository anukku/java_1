public class main_ex{
    public static void main(String [] args){
        adresa adresa1 = new adresa("Apusului", 33);
        Angajat_2 a1 = new Angajat_2(adresa1, "Ciobanu", "Matei", 100);
        System.out.println(adresa1.numar + " " + adresa1.strada);
        System.out.println(a1.salariu + " " + a1.nume + " " + a1.prenume);
        System.out.println(a1.calculeazaBonus("vechime medie"));
    }
}