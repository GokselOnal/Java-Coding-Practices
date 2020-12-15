public class DiamondPattern {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            for(int j = 1 ; j <= -1*i + 5; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2 * i -1; k++ ){
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i = 4 ; i >= 1 ; i--){
            for(int j = 1 ; j <= -1 * i + 5 ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2 * i -1 ; k++){
                System.out.print(i);
            }
            System.out.println();
            /*-> 1
                222
               33333
              4444444
             555555555
              4444444
               33333
                222
                 1
                   */
        }
    }
}
