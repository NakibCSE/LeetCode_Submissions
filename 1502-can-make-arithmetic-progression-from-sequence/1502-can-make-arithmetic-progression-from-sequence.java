class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        for(int i = 0; i<len-1; i++){
            int flag = arr[1]-arr[0];
            if((arr[i+1]-arr[i]) != flag){
                return false;
            }
        }
        return true;
    }
}