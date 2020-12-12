public class triangleShape {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= -1*i +5 ; j++){
                System.out.print(" ");
            }
            System.out.print("/");

            for(int k = 1 ; k <= 2*i - 2; k++){
                System.out.print(" ");
            }

            System.out.print("\\");
            System.out.println();
        }
        System.out.println("¯¯¯¯¯¯¯¯¯¯");
    }
}
