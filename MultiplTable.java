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

        /* ->   1 * 2 = 2
                1 * 4 = 4
                1 * 6 = 6
                1 * 8 = 8
                1 * 10 = 10

                4 * 2 = 8
                4 * 4 = 16
                4 * 6 = 24
                4 * 8 = 32
                4 * 10 = 40

                7 * 2 = 14
                7 * 4 = 28
                7 * 6 = 42
                7 * 8 = 56
                7 * 10 = 70
                             */
    }
}
