public class largestString {
    public static void main(String args[]) {
        String fruits[] = { "apple", "ball", "cat", "dog", "egg", "fan" };
        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++) { 
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Lexicographically largest string: " + largest);
    }
}
// Returns 0 if they are equal THIS IS EQUAL

// Returns < 0 if str1 comes before str2 then  THIS IS -VE 

// Returns > 0 if str1 comes after str2 THIS IS +VE 