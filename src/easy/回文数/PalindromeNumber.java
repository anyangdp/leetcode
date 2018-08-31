package easy.回文数;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int originx = x;
        if (x < 0) {
            return false;
        }
        int palindrome = 0;
        while (x != 0) {
            int temp = x % 10;
            palindrome = palindrome * 10 + temp;
            x = x / 10;
        }
        if (originx == palindrome) {
            return true;
        }
        return false;
    }
}
