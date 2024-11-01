package Arrays;
import java.util.Arrays;

class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int unique=0;
        for(int i=0;i<n;i++){
            if(nums[i] == val) nums[i] = 51;
            else unique++;
        }
        Arrays.sort(nums);
        return unique;
    }
}