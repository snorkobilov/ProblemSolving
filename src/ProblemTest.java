import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ProblemTest {
    @Test
    public void shouldRetrunFalseIfNotContainsDuplicate() {
        int[] arr = {1, 4, 6, 8};
        assertFalse(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldReturnTrueIfContainsDuplicate() {
        int[] arr = {2, 4, 6, 9, 3, 2};
        assertTrue(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldReturnTrueIfOnlyOneElement() {
        int[] arr = {1};
        assertFalse(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldFindPositiveDiagonalDifference() {
        int[][] arr = {{9, 2, 4}, {2, 4, 5}, {5, 6, 7}};
        assertEquals(7, Problem.diagonalDifference(arr));
    }

    @Test
    public void shouldFindNegativeDiagonalDifference() {
        int[][] arr = {{1, 2, 9}, {2, 4, 5}, {5, 6, 2}};
        System.out.println(arr.length);
        assertEquals(11, Problem.diagonalDifference(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNonSupportedArray() {
        int[][] arr = {{1, 2, 9}};
        Problem.diagonalDifference(arr);
    }
}
