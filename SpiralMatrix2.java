public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;

        int up=0;
        int down = n-1;
        int left = 0;
        int right = n-1;

        while(count <= (n*n)){
            // left -> right
            for(int col = left; col <= right; col++){
                ans[up][col] = count;
                count++;
            }

            // up -> down
            for(int row = up+1;row<=down;row++){
                ans[row][right] = count;
                count++;
            }

            // right -> left
            if(up != down)
            for(int col = right-1; col >= left; col--){
                ans[down][col] = count;
                count++;
            }

            // down -> up
            if(left != right)
            for(int row = down-1;row>up;row--){
                ans[row][left] = count;
                count++;
            }
            up++;
            down--;
            left++;
            right--;
        }
        return ans;
    }
}
