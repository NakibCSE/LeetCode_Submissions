class Solution {
    public int search(int[] nums, int target) {
        // Calculate array length
        int lengthOfArray = nums.length;
        
        // Initialize lower bound and upper bound of the search space 
        int index = -1, low = 0, high = lengthOfArray-1;
        
        //Loop through the search space till lower bound is
        //less than or equal to upper bound
        while(low<=high){
            
            // Calculate mid
            int mid = (low+high)/2;
            
            //If mid'th value is equal to target value 
            //return mid (we are looking you, mid :)
            if(nums[mid] == target)
            {
                return mid;
            }
            // if target value is greater than current mid number, go right
            else if( target > nums[mid]) {
                low = mid + 1;
            }
            
             // if target value is less than current mid number, go left
            else
            {
                high = mid-1;
            }
        }
        
        // If target is not found return -1
        return index;
    }
}