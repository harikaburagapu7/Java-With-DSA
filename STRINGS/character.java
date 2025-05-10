public  class character
{
    public static void main(String args[])
    {
        char arr[] = {'a','b','c','d'};
        String str="abcd";
        String str2 = new String ("xyz");

        System.out.println(str);
        System.out.println(str2);

       System.out.println(str.getClass().getName());
       System.out.println(str2.getClass().getName());


       // STRINGS ARE IMMUTABLE

    }
}