class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int len = points.length;
        int sum = 100000000;
        int Index = -1;
        for(int i = 0; i<len; i++){
            if(x==points[i][0] || y==points[i][1]){
                int mDis = Math.abs((x-points[i][0])) + Math.abs((y-points[i][1]));
                if(mDis<sum){
                    sum = mDis;
                    Index = i;
                }
            }
        }
        return Index;
    }
}