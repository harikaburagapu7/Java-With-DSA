import java.util.Scanner;


public class input_and_output {
    public static void main(String args[])
    {

        //DEFINE THE STRING 
        String str= "abcd";
        String str2 = new String ("xyz");

        // STRINGS ARE IMMUTABLE 

        // INPUT 
        Scanner sc = new Scanner(System.in);
        String name ;
    //    name =  sc.next();
    //     System.out.println(name);

        name = sc.nextLine();
        System.out.println(name);

    }
}
