import java.util.*;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/16
 */
public class P341 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>(nums.length);

        for (int n : nums) {
            numCount.merge(n, 1, Integer::sum);
        }

        List<Integer> distinct = new ArrayList<>(numCount.keySet());
        distinct.sort(Comparator.comparing(numCount::get));

        int[] result = new int[k];
        for (int i = 0; k > 0; k--, i++) {
            result[i] = distinct.get(distinct.size() - 1 - i);
        }

        return result;
    }
}
