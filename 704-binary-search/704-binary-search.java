class Solution {
    public int search(int[] nums, int target) {
        int lengthOfArray = nums.length;
        int index = -1, low = 0, high = lengthOfArray-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if( target > nums[mid]) {
                low = mid + 1;
            }
            else
            {
                high = mid-1;
            }
        }
        
        return index;
    }
}