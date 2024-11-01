
//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SpiralMatrix4 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int index = 0;
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = m-1;
        ListNode cur = head;
        while(index < (m*n)){
            for(int col = left; col <= right; col++){
                int val = -1;
                if (cur != null) {
                    val = cur.val;
                    cur = cur.next;
                }
                ans[up][col] = val;
                index++;
            }
            for(int row = up+1; row <= down; row++){
                int val = -1;
                if (cur != null) {
                    val = cur.val;
                    cur = cur.next;
                }
                ans[row][right] = val;
                index++;
            }
            if(up != down){
                for(int col = right-1; col >= left; col--){
                int val = -1;
                if (cur != null) {
                    val = cur.val;
                    cur = cur.next;
                }
                ans[down][col] = val;
                index++;
                }
            }
            if(left != right){
                for(int row = down-1; row > up; row--){
                    int val = -1;
                if (cur != null) {
                    val = cur.val;
                    cur = cur.next;
                }
                ans[row][left] = val;
                    index++;
                }
            }
            up++;
            left++;
            down--;
            right--;
        }
        return ans;
    }
}