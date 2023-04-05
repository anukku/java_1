public class Produs
{
    String nume;
    double pret;
    int numarRaion;

    double calculeazaReducere(){
    if(numarRaion == 3 && pret > 100) {
        pret = pret - pret * 0.25;
    }
    else{
        System.out.println("Produsul nu se incadreaza la reducere. ");
    }
        return pret;
    }
    void modificaRaion(int numarRaionNou){
        numarRaion = numarRaionNou;
    }

    public Produs(String nume, double pret, int numarRaion){
        this.numarRaion = numarRaion;
        this.nume = nume;
        this.pret = pret;
    }

}
