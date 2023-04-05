class Main_Angajat{
    void modificaSalariu(int salariu){
        salariu = 200;
    }
    void modificaSalariu(Angajat a){
        a.salariu = 500;
    }
    public static void main(String [] args){
        Main_Angajat m1 = new Main_Angajat();
        int x = 100;
        m1.modificaSalariu(x);
        System.out.println("Salariu modificat este: " + x);

        Angajat a1 = new Angajat("Ion", 1000);
        m1.modificaSalariu(a1.salariu);
        System.out.println(a1.salariu);
    }
}