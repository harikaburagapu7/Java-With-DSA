//each word forst letter in to the uppercase 
// hi, i am harika ---> Hi , I  am Harika.
// Charactr.toUpperCase(ch);
//ch  return capital character 

public class stringbuilder_uppercase {
    public static String  touppercase(String str)
    {
        // build the stringBuilder and give the sb as an object 
        StringBuilder sb = new StringBuilder("");

        // convert the each character in o=the uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1 ;i<str.length();i++)
        {
            // empty space we are coming or not 
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))) ;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
    
    
    public static void main(String args[])
    {
        String str = "hi my name is harika";
        System.out.println(touppercase(str));

         
    }
}
