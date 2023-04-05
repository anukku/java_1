public class Main7 {
    public static void main (String [] args){
        Angajat a1 = new Angajat();
        a1.salariu = 1000;
        a1.vechime = 10;
        a1.nume = "Ion";

        System.out.println(a1.get_salariu());
        int salariuAngajat = a1.get_salariu();
        System.out.println(a1.get_vechime());
        int vechimeAngajat = a1.get_vechime();
        System.out.println(a1.get_nume());
        String numeAngajat = a1.get_nume();
        a1.sePrezinta();
        System.out.println(a1.calculeazaBonus(24));
        Angajat a2 = new Angajat(4000, "Octavian", 3);
        System.out.println(a2.nume);
    }
}
