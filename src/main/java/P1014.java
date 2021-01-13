/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/17
 */
public class P1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int max = A[A.length - 2] + A[A.length - 1] - 1;
        int rightMax = A[A.length - 1] - (A.length - 1);

        for (int i = A.length - 2; i >= 0; i--) {
            max = Math.max(A[i] + i + rightMax, max);
            rightMax = Math.max(A[i] - i, rightMax);
        }

        return max;
    }
}
