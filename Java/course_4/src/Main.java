class main{
        public static void main (String [] args){
            Angajat a1 = new Angajat();
            a1.salariu = 3000;
            a1.nume = "Ion";

            a1.afiseazaInfo();
            a1.afiseazaInfo(10, "mesaj");
            a1.afiseazaInfo("mesaj", 10);
            a1.afiseazaInfo(10);
        }
}