public class palindromee {
    public static boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++)
        {
            int n = str.length();
         
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                // it returns false
                return false;
            }
            
        }
        // it returns true
        return true;

    }
    public static void  main(String args[])
    {
        String str = "buragapu harika";
        isPalindrome(str);

    }
    
}
