public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    int[] indexs = new int[2];
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if((nums[i] + nums[j]) == target){
                indexs[0] = i;
                indexs[1] = j;
                break;
            }
        }
    }
    return indexs;
}

// using Brute Force Method