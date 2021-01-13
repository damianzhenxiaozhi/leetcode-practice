import org.junit.jupiter.api.Test;

import java.util.function.DoubleToIntFunction;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/12/2
 */
public class P130Test {
    @Test
    public void testBasic() {
//        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] board =
        {{'O','O','O','O','O','O','O','O','X','O','O','O','O','O','X','O','O','O','O','O'},{'O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O','O'},{'X','O','O','X','O','X','O','O','O','O','X','O','O','X','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','X','X','O'},{'O','X','X','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','X','O','O','O','O','O','O','X','O','O','O','O','O','X','X','O'},{'O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O','O','O','O','X','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','X','O'},{'O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','X','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O'},{'X','O','O','O','O','O','O','O','O','X','X','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O'},{'O','O','O','O','X','O','O','O','O','O','O','O','O','X','O','O','O','O','O','X'},{'O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','X','O','X','O','O'},{'O','X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','X','X','O','O','O','X','O','O','X','O','O','X'},{'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'}}        ;

        P130 s = new P130();
        s.solve(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
