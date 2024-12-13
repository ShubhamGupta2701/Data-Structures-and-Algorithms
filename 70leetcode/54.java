public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    int rows = matrix.length;
    int cols = matrix[0].length;

    int count = 0;
    int up = 0;
    int down = rows-1;
    int left = 0;
    int right = cols-1;

    while(count < (rows*cols)){
        // left -> right
        for(int col = left; col <= right; col++){
            res.add(matrix[up][col]);
            count++;
        }

        //Up -> down
        for(int row = up + 1; row <= down; row++){
            res.add(matrix[row][right]);
            count++;
        }
        
        //right -> left
        if(up != down)
        for(int col = right - 1; col >= left; col--){
            res.add(matrix[down][col]);
            count++;
        }
        
        // down -> up
        if(left != right)
        for(int row = down-1; row > up; row--){
            res.add(matrix[row][left]);
            count++;
        }
        
        up++;
        left++;
        right--;
        down--;
    }

    return res;
}