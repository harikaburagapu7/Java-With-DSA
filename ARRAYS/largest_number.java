

public class largest_number
{
    public static int  largest(int numbers[])
    {
        // Scanner sc = new Scanner(System.in);

        int large_number = Integer.MIN_VALUE;// INFINITY
        int small_number = Integer.MAX_VALUE; // INFINITY

        for(int i = 0 ; i < numbers.length ; i++)
        {
            if(large_number < numbers[i])
            {
                large_number = numbers[i];
                return i ;
            } 

            if(small_number > numbers[i])
            {
                return i ;
            }

            
        }
        // return large_number;
        return small_number;

    }
    public static void main(String args[])
    {
        // largest();
        int numbers[] = { 1,2,6,5,3};
        System.out.println("The largerst value is : "+ largest(numbers));
        System.out.println(largest(numbers));
    }

}