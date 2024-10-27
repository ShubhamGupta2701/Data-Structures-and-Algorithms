public class SquaresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        
        // calculate the size of nums
        int n = nums.length;

        // create a new array of size n
        int[] output = new int[n];

        // Calculating square of all the elements and store it in new array i.e. output.
        for(int i=0;i<n;i++){
            output[i] = nums[i]*nums[i];
        }

        // Sorting output array using Arrays.sort() function.
        //Arrays.sort(output);  uncomment this line before running to sort it in asc order.

        return output;
    }
}
