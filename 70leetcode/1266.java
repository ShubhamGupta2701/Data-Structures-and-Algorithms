public int minTimeToVisitAllPoints(int[][] points) {
    int n = points.length;
    int ans = 0;
    int x1 = points[0][0];int y1 = points[0][1]; 
    for(int i=1;i<n;i++){
        int x2 = points[i][0] ;int y2 = points[i][1];
        ans += Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
        x1 = x2;
        y1 = y2;
    }
    return ans;
}