import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/15
 */
public class P1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.get(other) != null) {
                return new int[]{i, map.get(other)};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
