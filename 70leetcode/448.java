public List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    boolean[] isPresent = new boolean[n];
    for(int i=0;i<n;i++){
        isPresent[nums[i]-1] = true;
    }
    List<Integer> ans = new ArrayList<>();
    for(int i =0;i<n;i++){
        if(!isPresent[i]){
            ans.add(i+1);
        }
    }
    return ans;
}

// Here we use Hashmaps to check wheather an index is present or not
// if not then we store that index in our ans array and at the end of the loop we return that array.