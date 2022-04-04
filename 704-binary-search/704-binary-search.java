class Solution {
    public int search(int[] nums, int target) {
        int lengthOfArray = nums.length;
        int index = -1;
        for(int i=0;i<lengthOfArray;i++){
            if(nums[i]==target){
                index = i;
            }
        }
        return index;
        
    }
}