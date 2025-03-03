package DataStructures.arrays;

public class reverseString {

    public static void main(String[] args) {
        String test = "Hi, I am Luis";

        System.out.println(reverse(test));
    }

    public static StringBuilder reverse(String str) {
        if(str != null) {
            char[] charArray = str.toCharArray();

            StringBuilder reversed = new StringBuilder();

            for(int i = charArray.length-1; i >= 0; i--) {
                reversed.append(charArray[i]);
            }

            return reversed;
        } else {
            throw new RuntimeException("Null string");
        }
    }
}
