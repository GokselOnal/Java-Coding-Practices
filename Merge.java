public class Merge {
    static int[]  merge(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while ((i < arr1.length) && (j < arr2.length)){
            if (arr1[i] < arr2[j]){
                newArray[k] = arr1[i];
                i++;
            }
            else{
                newArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length){
            newArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newArray[k] = arr2[j];
            j++;
            k++;
        }
            return newArray;
    }

}
