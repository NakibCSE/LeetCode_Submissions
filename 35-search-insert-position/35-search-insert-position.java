class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize lower bound and upper bound
        int low = 0, high = nums.length - 1;
        
        //Loop through till low is less than or equal to high
        while(low<=high)
        {
            //Calculate mid
            int mid = (low+high)/2;
            
            //nums[mid] is equal to target, return mid
            if(nums[mid] == target)
            {
                return mid;
            }
            
            //If traget is greatter than nums[mid], go right
            else if(target> nums[mid]){
                low = mid+1;
            }
            //If Target is less than nums[mid], go left
            else
            {
                high = mid-1;
            }
           
        }
        
        //Return low (in which position target needed to be insertted)
        return low;
    }
}