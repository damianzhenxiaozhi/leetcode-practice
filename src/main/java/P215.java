import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/16
 */
public class P215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
