import java.util.Scanner;
public class calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operand :");
        char ch = sc.next().charAt(0);

        switch(ch){

            case '+' : System.out.println(a + b);
                        break ;

            case '-' : System.out.println( a - b);
                        break;

            case '*' : System.out.println( a * b);
                        break ;

            case '/' : System.out.println( a / b);
                        break;

            case '%' : System.out.println( a % b);
                        break;

            default : System.out.println( " Our calculator is ready");

        }




    }
}
