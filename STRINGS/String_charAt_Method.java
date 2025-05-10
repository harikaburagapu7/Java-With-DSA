public class String_charAt_Method {

    public static void printletters(String str)
    {
        //to print the all the letters
        for(int i = 0; i < str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
        public static void main(String args[])
    {
        // FIND CHARACTER 
        String firstName = "BUragapu";
        String LastName = "Harika";
        String  fullName = firstName + LastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(9));
        printletters(fullName);
    }
    
}
