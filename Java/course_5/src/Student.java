public class Student {
    double medie;
    String nume;
    private String orasProvenienta;
    public String getOrasProvenienta(){
        return orasProvenienta;
    }
    public void setOrasProvenienta(String orasProvenienta){
        this.orasProvenienta = orasProvenienta;
    }
    Student(){}
    Student(double medie, String nume){
        this.medie = medie;
        this.nume = nume;
    }
    Student(double medie, String nume, String orasProvenienta){
        this.medie = medie;
        this.nume = nume;
        this.orasProvenienta = orasProvenienta;
    }

    void afiseazaInfo(){
        System.out.println("Informatii din clasa parinte: medie-" + medie + " ,nume-" + nume);
    }

}
