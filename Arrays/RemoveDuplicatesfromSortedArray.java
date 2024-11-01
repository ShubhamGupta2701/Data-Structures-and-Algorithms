package Arrays;
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,j=0,prev=-101;
        for(i=0;i<n;i++){
            if(nums[i] != prev){
                prev = nums[i];
                nums[j] = prev;
                j++;
            } 
        }
        return j;
    }
}
