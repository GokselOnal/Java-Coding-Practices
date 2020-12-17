import java.util.Scanner;

public class Average {

    static Scanner console = new Scanner(System.in);
    public static int sum(int a){

        int sum = 0;
        for(int i = 1; i < a; i++){
            sum += i;
        }
        return sum;
    }

    public static double average(int a){
        return sum(a) / (a - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        int x = console.nextInt();

        System.out.println("Sum = " +sum(x) +"\nAverage "+ average(x));
    }
}
