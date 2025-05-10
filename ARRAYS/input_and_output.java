import java.util.Scanner;

public class input_and_output {
    public static void main(String arga[])
    {
        int marks [] = new int [100]; 
        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("Enter the marks of the three subjects ");

        System.out.println(marks[0] + marks[1] + marks[2]); //total marks 
        // now find the avarage marks 
        System.out.println("The avarage of the three subjects is : ");
        System.out.println(marks[0] + marks[ 1 ] + marks [2 ] / 3);
        

        // update the marks [2] marks 
        marks[2 ] = 100 ;
        System.out.println(marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println(marks[2]);


        // percentage
        System.out.println(marks[0]+marks [1] + marks [2] / 3);
        int percentage = marks[0]+marks [1] + marks [2] / 3;
        System.out.println("THe total three subjects percentage is : "+ percentage  +"%" );

        // lenght of an array 
        System.out.println("The length of an arraya " + marks.length);

        
    

        

        

        




    }
    
}
