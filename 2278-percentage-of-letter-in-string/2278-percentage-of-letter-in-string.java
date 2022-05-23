class Solution {
    public int percentageLetter(String s, char letter) {
        double len = s.length();
        double cnt = 0;
        for(int i = 0; i<len; i++){
            if(s.charAt(i)==letter)
            {
                cnt++;
            }
        }
        
        double percentage = (cnt/len)*100;
        int ans = (int)percentage;
        return ans;
    }
}