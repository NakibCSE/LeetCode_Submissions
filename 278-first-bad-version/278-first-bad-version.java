/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        //Initializing the upper bound and lower bound
        int low = 1, high = n;
        
        //Looping till low is less than or equal to high
        while(low<=high)
        {
            // Calculate mid
            int mid = low + (high - low ) / 2;
            
            //Calling isBadVersion API to check mid is bad version or not
            // If yes, go left
            if(isBadVersion(mid))
            {
                high = mid - 1;
            }
            
            // Go right
            else
            {
                low = mid + 1;
            }
        }
        //return first bad version (low)
        return low;
    }
}