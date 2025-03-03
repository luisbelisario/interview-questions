package DataStructures.arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] arr = new int[temp.length()];
        int[] arrInvert = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
            arrInvert[temp.length()-1-i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < temp.length(); i++) {
            if(arr[i] != arrInvert[i]) {
                return false;
            }
        }
        return true;
    }
}
