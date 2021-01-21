/**
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/21
 */
public class P684 {
    private int[] uf;
    private int[] depth;
    private int n;

    public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[2];
        if (edges.length == 0) {
            return result;
        }

        init(edges.length);

        for (int[] edge : edges) {
            if (find(edge[0], edge[1])) {
                result[0] = edge[0];
                result[1] = edge[1];
                return result;
            }
            union(edge[0], edge[1]);
        }

        return result;
    }

    private void init(int n) {
        this.n = n;
        uf = new int[n + 1];
        depth = new int[n + 1];
        for (int i = 0; i < n; i++) {
            uf[i] = i;
            depth[i] = 1;
        }
    }

    private boolean find(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int p) {
        while (p != uf[p]) {
            uf[p] = uf[uf[p]];
            p = uf[p];
        }

        return p;
    }

    private void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) {
            return;
        }

        if (depth[rootP] > depth[rootQ]) {
            uf[rootQ] = rootP;
        } else if (depth[rootP] < depth[rootQ]) {
            uf[rootP] = rootQ;
        } else {
            uf[rootQ] = rootP;
            depth[rootP] += 1;
        }
    }
}
