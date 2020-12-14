import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14;
    static Scanner console = new Scanner(System.in);

    public static double calculateArea(int radius){
        return PI * radius * radius;
    }

    public static double calculateCircumference(int radius){
        return PI * 2 * radius;
    }

    public static double convertDegreeToRadian(double degree){
        return degree * PI / 180;
    }

    public static void printInfo(int radius, double degree){
        System.out.println("Area: " + calculateArea(radius));
        System.out.println("Circumference: " + calculateCircumference(radius));
        System.out.println("Radian: " + convertDegreeToRadian(degree));
    }

    public static void main(String[] args) {
        System.out.print("Enter radius please: ");
        int r = console.nextInt();

        System.out.print("Enter degree please: ");
        double degree = console.nextDouble();
        System.out.println();

        printInfo(r,degree);
    }

}
