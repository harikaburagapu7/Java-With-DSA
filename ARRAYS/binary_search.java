public class binary_search {
    public static int binary (int key ,  int numbers[])
    {
        int start = 0 ; 
        int end = numbers.length - 1 ;
        while ( start <= end )
        {
            //  for finding the mid 
            int mid = (start + end ) / 2;

            // comparasions
            if(numbers[mid] == key ) // found 
            {
                return mid;
            }
            if(numbers[mid] < key)// right nor 2nd half 
            {
                start = mid + 1;
            }
            else{ // left side part or 1st half 
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main (String args[])
    {
        int key = 25 ;
        int numbers[] = {2,4,6,8,10,12,14};
        System.out.println("The index  key is : " +  binary( key , numbers));

    }
}
