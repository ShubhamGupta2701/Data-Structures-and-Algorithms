package Arrays;
// import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0;i<n;i++){ 
        //     nums1[m+i] = nums2[i];
        // }
        // Arrays.sort(nums1);

        int p = m-1, q = n-1, r = nums1.length-1;
        while(r>=0){
            if(q<0)break;
            if(p>=0 && nums1[p]>=nums2[q]) nums1[r--] = nums1[p--];
            else{
                nums1[r--] = nums2[q--];
            }
        }
    }    
}
