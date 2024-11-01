import java.util.*;

public class Hashing {
    public static void Hashing(String[] args) {
        int[] arr = new int[]{2,3,5,2,1,3,2,7,8,7};
        Arrays.sort(arr);
        int lastIndex = arr.length - 1;
        int maxele = arr[lastIndex];
        int[] freq = new int[maxele+1];
        for(int i=0;i<freq.length;i++)freq[i] = 0;
        for(int element : arr){
            freq[element]++;
        }

        for(int i=0;i<freq.length;i++){
            System.out.println("frequency of : "+i+" is : "+freq[i]);
        }
    }
}
