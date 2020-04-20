package ValidPalindrome_0125;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  ValidPalindrome_125
 * @created : 2020/4/10
 * @description : https://leetcode.com/problems/valid-palindrome
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[\\W+]", "").replaceAll("[\\s]", "").toLowerCase();
        int length = str.length();

        if(length <= 0){ // 说明：本题中，我们将空字符串定义为有效的回文串。
            return true;
        }

        int i = 0;
        while(i <= Integer.parseInt(String.valueOf(length / 2), 10)) {
            if(str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

//        String s = "A man, a plan, a canal: Panama"; // 输出 true
//        String s = "race a car"; // 输出 false
        String s = "`l;`` 1o1 ??;l`"; // 输出 true

        System.out.println(isPalindrome(s));
    }
}
