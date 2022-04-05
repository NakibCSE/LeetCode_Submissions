class Solution {
    public int[] sortedSquares(int[] nums) {
        //Find the array length
        int len = nums.length;
        
        // Traverse the whole array and square each number
        for(int i=0;i<len;i++){
            nums[i] = nums[i]*nums[i];
        }
        
        //Sort the modified array
        Arrays.sort(nums);
        return nums;
    }
}