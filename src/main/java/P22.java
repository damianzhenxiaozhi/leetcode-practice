import java.util.ArrayList;
import java.util.List;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/12/3
 */
public class P22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String path = "";
        dfs(0, 0, n, path, result);

        return result;
    }

    private void dfs(int left, int right, int n, String path, List<String> result) {
        if (left == n && right == n) {
            result.add(path);
            System.out.println(path);
            return;
        }

        if (left == n) {
            if (right < n) {
                dfs(left, right + 1, n, path + ")", result);
            }
        } else {
            dfs(left + 1, right, n, path + "(", result);
            if (left > right) {
                dfs(left, right + 1, n, path + ")", result);
            }
        }
    }

    public static void main(String[] args) {
        P22 s = new P22();
        s.generateParenthesis(3);
    }
}
