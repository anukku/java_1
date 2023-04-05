public class Angajat_2 {
    String nume;
    String prenume;
    int salariu;
    int vechime;
    adresa adresa;
    public Angajat_2(adresa adresa, String nume , String prenume, int salariu) {
        this.adresa = adresa;
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
    }

    void modificaAdresa(String strada, int numar) {
        adresa.modificaAdresa(strada, numar);
    }

    void modificaAdresa(adresa adresaNoua) {
        this.adresa = adresaNoua;
    }

    public double calculeazaBonus(String tipVechime) {
        switch (tipVechime) {
            case "vechime mica":
                return 100;
            case "vechime medie":
                return 250;
            case "angajat vechi":
                return 500;
            default:
                return -1;
        }
    }

}