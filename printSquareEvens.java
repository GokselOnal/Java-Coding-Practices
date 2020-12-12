public class printSquareEvens {
    public static void main(String[] args) {

        System.out.print("Square of the even numbers [10,1]: ");
        for(int i = 10 ; i >= 0 ; i--){
            if(i % 2 == 0){
                System.out.print((i * i) + " ");
            }
        }
    }
}
