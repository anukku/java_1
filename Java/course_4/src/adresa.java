public class adresa{
    String strada;
    int numar;
    public adresa(String strada, int numar){
        this.strada = strada;
        this.numar = numar;
    }
    public void modificaAdresa(String strada, int numar) {
        this.strada = strada;
        this.numar = numar;
    }

    public String getStrada() {
        return strada;
    }

    public int getNumar() {
        return numar;
    }
}