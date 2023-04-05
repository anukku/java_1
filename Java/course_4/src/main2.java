class main2{
    public static void main (String [] args){
        int [] x = {1, 2, 3, 4};
        for(int i : x){
            System.out.println(i);
        }
        int contor = 0;
        int [][] y = new int [3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                y[i][j] = contor;
                contor ++;
            }
        }
        for(int [] i : y ){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}