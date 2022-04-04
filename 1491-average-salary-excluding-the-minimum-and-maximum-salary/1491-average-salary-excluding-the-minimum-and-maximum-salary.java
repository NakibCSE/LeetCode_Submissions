class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int low = 1, high = salary.length - 1;
         double sum = 0;
        for(int i = low; i<high; i++){
            sum+=salary[i];
        }
        return sum/(salary.length-2);
    }
}