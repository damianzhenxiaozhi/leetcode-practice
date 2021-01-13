import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/22
 */
public class PI16_18_Test {
    @Test
    public void testBasic() {
        String pattern = "babbbbbbbbbbbabbbbbabbaaabbabbabab";
        String value = "wuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwuwuwuwuwuwuwuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuywewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwu";

        PI16_18 s = new PI16_18();
        boolean res = s.patternMatching(pattern, value);
        assertFalse(res);
    }
}
