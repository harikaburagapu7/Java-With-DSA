public class linear_search
{
    public static int  linear (int  key, int numbers[])
    {
        for ( int i = 0 ; i <= numbers.length ; i++ )
        {
            if(numbers[i] == key )
            {
                // System.out.println("element is found ");
                return i;

            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int numbers[] = { 1,2,3,4,5};
        int key  = 4;
        int index = linear (key, numbers);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("element is found "); 
            System.out.println("The key is at index : " + index);

        }
        


    }
}