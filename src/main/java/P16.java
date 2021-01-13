import java.util.Arrays;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/15
 */
public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
            }
        }

        return closestSum;
    }
}
