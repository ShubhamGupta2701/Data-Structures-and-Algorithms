class Solution {
    public long gridGame(int[][] grid) {
        long top = 0;
        for(int i=0;i<grid[0].length;i++){ // calculating max of 1st row for rob 1.
            top += grid[0][i];
        }

        long botm = 0, res = Long.MAX_VALUE;
        for(int i = 0; i<grid[0].length;i++){ // calculate max for rob 1 and respective pattern for robt 2.
            top -= grid[0][i];
            res = Math.min(res,Math.max(top,botm));
            botm += grid[1][i];
        }
        return res;
    }
}