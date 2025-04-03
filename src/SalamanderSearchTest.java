import static org.junit.Assert.*;
import org.junit.Test;

public class SalamanderSearchTest {

    @Test
    public void canReach_PathExists() {
        char[][] enclosure = {
            {'.','.','.','.','.','.'},
            {'W','.','W','W','.','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','s','.','.'},
        };
        boolean actual = SalamanderSearch.canReach(enclosure);
        assertTrue(actual);
    }

    @Test
    public void canReach_NoPath() {
        char[][] enclosure = {
            {'.','.','.','.','.','.'},
            {'W','W','W','W','s','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','.','.','.'},
        };
        boolean actual = SalamanderSearch.canReach(enclosure);
        assertFalse(actual);
    }
}
