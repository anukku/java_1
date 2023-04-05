class Main_Animal{
    public static void main (String [] args){
        System.out.println("Zona de memorie inainte de creearea obiectelor " + Animal.contor);
        Animal a1 = new Animal("Leu", 300);
        System.out.println("Zona de memorie statica contor dupa creearea unui obiect " + Animal.contor);
        Animal a2 = new Animal("Leut", 3000);
        System.out.println("Zona de memorie statica contor dupa creearea unui obiect " + Animal.contor);
        a1.contor = 5;
        System.out.println(a1.contor);
        Animal.metodaStatica("mesaj1");
        a1.metodaStatica("mesaj2");

    }
    }