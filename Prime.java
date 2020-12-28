public class Prime {
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        if(number == 2){
            return true;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
