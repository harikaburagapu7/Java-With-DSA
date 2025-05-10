public class sub_array
{
    public static void  part(int numbers[])
    {
        for(int i = 0; i<numbers.length;i++)
        {
            int ts = 0;
            int start = i;
            for(int j = i ; j < numbers.length; j++)
            {
                int end = j;
                for (int k = start; k <= end ; k++)// print
                {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                ts++;
                System.out.println("the total sub array is : " + ts);
            
            }
            
            System.out.println();
            


        }
        
        

    }
    public static void main(String args[])
    {
        int numbers[] = { 2,4,6,8,10};
        part(numbers);

    }
}