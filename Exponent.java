public class Exponent {
    public static void main(String[] args) {
        int exp = 0; //dummy
        int base = 2;
        while(exp != 9){
            exp++;
            System.out.print(((int)Math.pow(base,exp)) + " ");
        }
    }
}
