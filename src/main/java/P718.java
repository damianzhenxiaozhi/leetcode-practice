import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/7/1
 */
public class P718 {
//    public int findLength(int[] A, int[] B) {
//        int alen = A.length;
//        int blen = B.length;
//
//        if (alen > blen) {
//            int[] tmp = A;
//            A = B;
//            B = tmp;
//
//            int tmpLen = alen;
//            alen = blen;
//            blen = tmpLen;
//        }
//
//        Map<Integer, List<Integer>> bi = new HashMap<>();
//        for (int i = 0; i < blen; i++) {
//            int n = B[i];
//            if (bi.get(n) == null) {
//                bi.put(n, new ArrayList<Integer>());
//            }
//            bi.get(n).add(i);
//        }
//
//        int maxLen = 0;
//        for (int i = 0; i < alen; i++) {
//            List<Integer> bIndexs = bi.get(A[i]);
//            if (bIndexs == null) {
//                continue;
//            }
//
//            for (int j : bIndexs) {
//                int k = 0;
//                while (i + k < alen && j + k < blen && A[i + k] == B[j + k]) {
//                    k++;
//                }
//                maxLen = Math.max(maxLen, k);
//            }
//        }
//
//        return maxLen;
//    }
    public int findLength(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;

        int[][] dp = new int[aLen + 1][bLen + 1];
        int res = 0;
        for (int i = aLen - 1; i >= 0; i--) {
            for (int j = bLen - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    res = Math.max(dp[i][j], res);
                }
            }
        }

        return res;
    }
}
