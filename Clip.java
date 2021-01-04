public class Clip {
    static int[] clip(int[] array , int num){
        for(int i = 0; i < array.length; i++){
            if(array[i] > num){
                array[i] = num;
            }
        }
        return array;
    }
}
