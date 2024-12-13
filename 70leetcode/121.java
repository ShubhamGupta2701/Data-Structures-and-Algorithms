public int maxProfit(int[] prices) {
    int n = prices.length;
    int max = 0;
    int l = 0;
    for(int r=1;r<n;r++){
        if(prices[l] < prices[r]){
            int profit = prices[r] - prices[l];
            max = Math.max(max,profit);
        }else{
            l = r;
        }
    }
    return max;
}