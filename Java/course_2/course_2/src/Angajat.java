public class Angajat {
    String nume;
    int salariu;
    int vechime;
    public Angajat(){}
    public Angajat(int salariu, String nume, int vechime){
        this.salariu = salariu;
        this.nume = nume;
        this.vechime = vechime;
    }
    void sePrezinta(){
        System.out.println(nume + " are salariul de: " + salariu + " euro si are vechimea de " + vechime);
    }

    int calculeazaBonus(int oreSuplimentareLucrate){
        if(oreSuplimentareLucrate > 1 && oreSuplimentareLucrate < 5) return 100;
        else return 200;
    }

    int get_salariu(){
        return salariu;
    }
    int get_vechime(){
        return vechime;
    }
    String get_nume() {
        return nume;
    }


}