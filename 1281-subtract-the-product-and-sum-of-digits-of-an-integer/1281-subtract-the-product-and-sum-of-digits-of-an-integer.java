class Solution {
    public int subtractProductAndSum(int n) {
        
        int pr = 1, sm = 0,r;
        while(n>0){
             r = n%10;
             pr*=r;
             sm+=r;
             n/=10;
        }
        return pr-sm;
    }
}