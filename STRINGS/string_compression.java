public class string_compression {

    public static String compression(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Add character to result
            newStr += str.charAt(i);

            // Add count if greater than 1
            if (count > 1) {
                newStr += Integer.toString(count);
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        String str = "aaabbccccdd";
        System.out.println(compression(str));
    }
}
