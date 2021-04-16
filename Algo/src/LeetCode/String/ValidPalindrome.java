package LeetCode.String;

// 거꾸로 읽어도 같은 문자열인지 판별하는 문제.
public class ValidPalindrome {
    //	https://programmersought.com/article/43742137211/
    public boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome aa = new ValidPalindrome();
//		String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(aa.isPalindrome(s));
    }
}