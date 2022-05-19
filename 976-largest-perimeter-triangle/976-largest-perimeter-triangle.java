class Solution {
    public int largestPerimeter(int[] nums) {
        int sum = 0, n = nums.length-1;
        Arrays.sort(nums);
        for(int i = n; i>=2; i-- ){
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return sum;
    }
}