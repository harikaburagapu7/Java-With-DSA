public class array_as_function {
    public static void update( int marks[] , int nonchangable)
    {
        nonchangable = 5;
        for(int i = 0; i < marks.length;i++)
        {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        int nonchangable = 10;
        System.out.println("The value of the non changable value is : " + nonchangable);
        int marks[] = { 97,98,99};
        update(marks , nonchangable);

        for(int i = 0; i < marks.length ; i++)
        {
            System.out.println(marks[i] + " ");

        }
        System.out.println();


    }
    
}
