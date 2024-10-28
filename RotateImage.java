public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int k=0;
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            int col = 0;
            for(int j=n-1;j>=0;j--){
                temp[k][col] = matrix[j][k];
                col++;
            }
            k++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
