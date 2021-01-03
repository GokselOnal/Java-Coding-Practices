import java.util.Scanner;

public class PassFail {
    static Scanner console = new Scanner(System.in);

    static boolean isPass(double mt, double f, double proj){
        double overall = mt*0.3 + f*0.5 + proj*0.5;

        return overall > 50;
    }
    public static void main(String[] args) {
        double midterm,finalgrade,project;

        System.out.print("Enter mid term grade: ");
        midterm = console.nextDouble();

        System.out.print("Enter final grade: ");
        finalgrade = console.nextDouble();

        System.out.print("Enter project grade: ");
        project = console.nextDouble();

        System.out.print("Your result: ");
        if(isPass(midterm,finalgrade,project)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
