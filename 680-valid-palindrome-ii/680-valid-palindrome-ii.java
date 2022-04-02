class Solution {
    public boolean validPalindrome(String s) {
        // Calculate the string length
        int len = s.length();
        
        // Initialize two pointers
        int i = 0, j = len-1;
        
        //Loop though the string till two pointers meet
        while(i<=j)
        {
            // If character at i'th position match with the character with j'th position
            // increase i and j by 1 repectively
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            // If i'th character doesn't match with j'th character, call isPalindrome 
            else
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
        }
        // If the string is a palindrome, return true.
        return true;
    }
    
    // Punction for checking a string is palindrome or not
    public boolean isPalindrome(String s,int i, int j)
    {
        //Loop through the string till the two pointers meet
        while(i<=j)
        {
            // If character at i'th position match with the character with j'th position
            // increase i and j by 1 repectively
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else 
                return false;
        }
        return true;
    }
    
}