public class StringDivider {

    public static String divide(String str1, String str2){
        System.out.print(str1 +"\t");
        System.out.print(str2 + "\t");

        String str3 = "";
        for(int i = 0 ; i < str1.length() ; i++){
            for(int j = 0 ; j < str2.length(); j++){
                str3 += "" + str1.charAt(i) + str2.charAt(j) + " " ;
            }
        }
        return str3;
    }

    public static void main(String[] args) {

        System.out.println(divide("ABCD","EFGH")); // -> ABCD EFGH AE AF AG AH BE BF BG BH CE CF CG CH DE DF DG DH
    }
}
