public class Main3 {
    public static void main(String [] args){
        StudentLimbiStraine sls = new StudentLimbiStraine();
        StudentSport ss = new StudentSport();
        sls.nume = "Student limbi";
        sls.medie = 9.8;
        sls.nrLimbiCunoscute = 4;
        //sls.orasProvenienta = "Vaslui";
        //sls.sportFavorit = "volei";
        sls.setOrasProvenienta("Vaslui");
        System.out.println(sls.getOrasProvenienta());
        ss.nume = "Student sport";
        ss.medie = 10;
        ss.sportPreferat = "Fotbal";
        sls.afiseazaInfo();
    }
}
