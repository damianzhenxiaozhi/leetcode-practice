import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/15
 */
public class P15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }

            // skip same int except the first one
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    right--;
                    while (right >= 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                    while (left < nums.length && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (right >= 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
