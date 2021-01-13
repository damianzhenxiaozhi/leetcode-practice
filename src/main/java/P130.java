import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/12/1
 */
public class P130 {
    private static class Node {
        private int i;
        private int j;
        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public void solve(char[][] board) {
        int rowNum = board.length;
        if (rowNum <= 1) {
            return;
        }

        int colNum = board[0].length;
        if (colNum <= 1) {
            return;
        }

        for (int i = 0; i < rowNum; i++) {
            char c = board[i][0];
            if (c == 'O') {
                setByBfs(new Node(i, 0), board);
            }

            c = board[i][colNum - 1];
            if (c == 'O') {
                setByBfs(new Node(i, colNum - 1), board);
            }
        }

        for (int i = 0; i < colNum; i++) {
            char c = board[0][i];
            if (c == 'O') {
                setByBfs(new Node(0, i), board);
            }

            c = board[rowNum - 1][i];
            if (c == 'O') {
                setByBfs(new Node(rowNum - 1, i), board);
            }
        }

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void setByBfs(Node startNode, char[][]board) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(startNode);

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (board[node.i][node.j] != 'O') {
                continue;
            }

            board[node.i][node.j] = 'Y';

            if (node.i > 0 && board[node.i - 1][node.j] == 'O') {
                q.add(new Node(node.i - 1, node.j));
            }

            if (node.i < board.length - 1 && board[node.i + 1][node.j] == 'O') {
                q.add(new Node(node.i + 1, node.j));
            }

            if (node.j > 0 && board[node.i][node.j - 1] == 'O') {
                q.add(new Node(node.i, node.j - 1));
            }

            if (node.j < board[0].length - 1 && board[node.i][node.j + 1] == 'O') {
                q.add(new Node(node.i, node.j + 1));
            }
        }
    }
}
