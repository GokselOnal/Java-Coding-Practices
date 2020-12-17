import java.util.Scanner;

public class Evens {
    static Scanner console = new Scanner(System.in);

    public static void printEvens(int a, int b){

        for(int i = a; i <= b; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter a: ");
        a = console.nextInt();

        System.out.print("Enter b: ");
        b = console.nextInt();

        printEvens(a,b);
    }
}
