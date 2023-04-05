class Angajat {
    int salariu;
    String nume;

    void afiseazaInfo(){
        System.out.println("Salariu: " + salariu);
        System.out.println("Nume: " + nume);
    }

    void afiseazaInfo(int vechime){
        System.out.println("Angajatul " + nume + " are vechimea de " + vechime + " ani");
    }

    void afiseazaInfo(String mesaj) {
        System.out.println(mesaj);
    }

    void afiseazaInfo(String mesaj1, String mesaj2){
        System.out.println("Mesajele primite ca parametrii sunt: ");
        System.out.println(mesaj1);
        System.out.println(mesaj2);
    }

    void afiseazaInfo(int vechime, String mesaj){
        System.out.println("Parametru 1 vechime, parametru 2 mesaj");
    }
    void afiseazaInfo(String mesaj, int vechime ){
        System.out.println("Parametru 1 mesaj, parametru 2 vechime");
    }
}