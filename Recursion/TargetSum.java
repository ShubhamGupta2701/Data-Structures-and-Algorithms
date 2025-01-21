class Solution {
    public int check(int[] arr, int target, int index, int sum){
        if(index >= arr.length){
            return sum == target ? 1 : 0;
        }
        int sub = check(arr,target,index+1,sum-arr[index]);
        int add = check(arr,target,index+1,sum+arr[index]);

        return sub+add;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return check(nums,target,0,0);
    }
}