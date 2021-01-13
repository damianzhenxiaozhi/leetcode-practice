/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/30
 */
public class P209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];

            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }

            if (minLen == 1) {
                return minLen;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
