public class SumFormula {
    public static void main(String[] args) {
        
        double sum = 0;
        for(double i = 1 ; i <= 15 ; i++){
            sum += 1 /(i * i);
        }
        double result = sum;
        System.out.println(result);
    }
}
