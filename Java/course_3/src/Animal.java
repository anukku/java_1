class Animal{
    static int contor = 0;
    String nume;
    double greutate;

    Animal(String nume, double greutate){
        this.nume = nume;
        this.greutate = greutate;
        contor++;
    }
    static void metodaStatica(String mesaj){
        System.out.println("Mesajul primit ca parametru este: " + mesaj);
        System.out.println("Contorul are valoarea: " + contor);
    }
}