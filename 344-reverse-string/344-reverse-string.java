class Solution {
    public void reverseString(char[] s) {
        // Calculate the string length
        int len = s.length;
        
        // Initialize two pointers
        int i = 0, j = len-1;
        
        //Loop though the string till two pointers meet
        while(i<=j){
            
            // Sotre i'th charater to a temporary variable called temp
            char temp = s[i];
            
            //Copy j'th character to i'th position 
            s[i] = s[j];
            
            //Copy the character stored in temp variable to j'th position
            s[j] = temp;
            
            //Increase the first pointer by 1
            i++;
            
            //Decrease the second pointer by 1
            j--;
        }
    }
}