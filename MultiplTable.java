public class MultiplTable {
    public static void main(String[] args) {

        for(int i = 1 ; i < 10; i+=3){
            for(int j = 1 ; j <= 10 ; j++){
                if(j % 2 == 0){
                    System.out.println( i + " * " + j + " = " + (i*j));
                }
            }
            System.out.println();
        }
    }
}
