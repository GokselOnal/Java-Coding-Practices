public class StringManipulation {
    public static String swap(String str, int indx1,int indx2){
        char swap1 = str.charAt(indx1);
        char swap2 = str.charAt(indx2);

        String firstPart = str.substring(0,indx1);
        String secondPart = str.substring(indx1 + 1,indx2);
        String lastPart = str.substring(indx2 + 1);
        String result = firstPart + swap2 + secondPart + swap1 + lastPart;

        return result;
    }

    public static void main(String[] args) {
        swap("hello",0,4); //-> returns "oellh"
        swap("Goksel", 2,4); // -> returns "Goeskl"
    }
}
