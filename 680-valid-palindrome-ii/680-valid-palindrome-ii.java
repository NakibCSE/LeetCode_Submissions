class Solution {
    public boolean validPalindrome(String s) {
        // Calculate the string length
        int j = s.length()-1;
        int i = 0;
        
        //
        while(i<=j)
        {
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
        }
        return true;
    }
    
    // Punction for checking a string is palindrome or not
    public boolean isPalindrome(String s,int i, int j)
    {
        while(i<=j)
        {
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