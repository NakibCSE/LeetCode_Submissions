class Solution {
    public int arraySign(int[] nums) {
        int len = nums.length;
        int NumberOfNegativeValue=0, NumberOfPositiveValue=0;
        for(int i =0; i<len; i++){
            if(nums[i] == 0){
                return 0;
            }
            else{
                if(nums[i]<0)
                {
                    NumberOfNegativeValue++;
                }
            }
        }
        if( NumberOfNegativeValue%2==0){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}