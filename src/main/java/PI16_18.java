/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/22
 */
public class PI16_18 {
    public boolean patternMatching(String pattern, String value) {
        if (pattern.isEmpty()) {
            return value.isEmpty();
        }

        int ca = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                ca++;
            }
        }
        int cb = pattern.length() - ca;

        int vLen = value.length();
        int aLenMax = ca == 0 ? 0 : vLen / ca;
        for (int aLen = 0; aLen <= aLenMax; aLen++) {
            if (cb != 0 && (vLen - aLen * ca) % cb != 0) {
                continue;
            }

            int bLen = (cb == 0) ? 0 : (vLen - aLen * ca) / cb;

            if (match(pattern, value, aLen, bLen)) {
                return true;
            }
        }

        return false;
    }

    private boolean match(String pattern, String value, int aLen, int bLen) {
        String a = null;
        String b = null;
        int v = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                if (a == null) {
                    a = value.substring(v, v + aLen);
                } else if (!a.equals(value.substring(v, v + aLen))) {
                        return false;
                }
                v += aLen;
            } else {
                if (b == null) {
                    b = value.substring(v, v + bLen);
                } else if (!b.equals(value.substring(v, v + bLen))) {
                        return false;
                }
                v += bLen;
            }

            if (a != null && b != null && a.equals(b)) {
                return false;
            }

            if (v > value.length()) {
                return false;
            }
        }

        return true;
    }
}
