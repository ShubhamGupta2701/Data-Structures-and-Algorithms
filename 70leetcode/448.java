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