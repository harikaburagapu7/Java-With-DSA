import java.util.Scanner;

public class six {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        do { 
            System.out.println("Enter your number:");
            int n = sc.nextInt();
            

            if (n % 10 == 0)
            {
                continue;
            }
            System.out.println("number was : " + n);
        } while (true);
    }
}
