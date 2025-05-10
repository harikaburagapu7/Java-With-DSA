

public class compare {
    public static void main(String args[])
    {
        String s1 = "Harika";
        String s2 = "Harika";
        String s3 = new String("Harika");

        if(s1==s2)
        {
            System.out.println("yes they are matched");
        }
        else{
            System.err.println("Strings are not equal ");
        }
        

        if(s1 == s3)
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are   not equal ");
        }

        if(s1.equals(s3))
        {
            System.out.println("the both are the strings ");
        }
        else
        {
            System.out.println("it returns false and they both are not the equal ");
        }
    }
    
}
