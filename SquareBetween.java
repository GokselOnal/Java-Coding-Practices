import java.util.Scanner;

public class SquareBetween {
    static Scanner console = new Scanner(System.in);

    public static void square(int x, int y){

        int sum = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 == 0){
                sum += i * i;
            }
        }
        System.out.println("Square of numbers between " + x +" and "+ y + " = " + sum);
    }

    public static void main(String[] args) {
        int x,y;
        System.out.print("Enter x: ");
        x = console.nextInt();

        System.out.print("Enter y: ");
        y = console.nextInt();

        square(x,y);
    }
}
