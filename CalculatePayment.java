import java.util.Scanner;

public class CalculatePayment {
    public static final String STOP = "stop";
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        int pay;
        int sum = 0;


        do {
            System.out.println("Please enter employee's name, or enter stop to exit:");
            name = console.nextLine();
            if(name.equals(STOP)){
                break;
            }
            System.out.println("Please enter employee's weekly pay:");
            pay = console.nextInt();
            sum += pay;
            console.nextLine();
        }
        while (!name.equals(STOP));

        System.out.println("The amount you have to pay to employee is " + sum +"TL in total.");
    }
}
