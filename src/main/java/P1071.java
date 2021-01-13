import java.util.ArrayList;
import java.util.List;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/12/3
 */
public class P1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() == 0 || str1.length() == 0) {
            return "";
        }

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int size = 0;
        while (size < str1.length() && str1.charAt(size) == str2.charAt(size)) {
            size++;
        }
        if (size == 0) {
            return "";
        }

        for (int i = size; i > 0; i--) {
            if (str1.length() % i != 0 || str2.length() % i != 0) {
                continue;
            }

            String s = str1.substring(0, i);
            if (!isDivide(str1, s)) {
                continue;
            }

            if (!isDivide(str2, s)) {
                continue;
            }

            return s;
        }

        return "";
    }

    boolean isDivide(String str, String subStr) {
        int size = subStr.length();
        for (int i = 0; i < str.length(); i += size) {
            if (!subStr.equals(str.substring(i, i + size))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        P1071 s = new P1071();
        System.out.println(s.gcdOfStrings("ABABAB", "ABAB"));
    }
}
