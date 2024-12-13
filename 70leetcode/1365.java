public int[] smallerNumbersThanCurrent(int[] nums) {
    int n = nums.length;
    
    // create new array to return 
    int[] ans = new int[n];

    // loop 1 for iterating the nums[i]
    for(int i=0;i<n;i++){
        int count =0;
        // loop 2 for checking how many numbers are smaller then nums[i]
        for(int j=0;j<n;j++){
            // if condition to check it.
            if(j!=i && nums[j] < nums[i]){
                count++;
            }
        }
        ans[i] = count;
    }
    return ans;

}