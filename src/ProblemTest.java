import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ProblemTest {
    @Test
    public void shouldRetrunFalseIfNotContainsDuplicate() {
        int[] arr = {1, 4, 6, 8};
        assertFalse(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldReturnTrueIfContainsDuplicate(){
        int[] arr = {2,4,6,9,3,2};
        assertTrue(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldReturnTrueIfOnlyOneElement(){
        int[] arr = {1};
        assertFalse(Problem.containsDublicate(arr));
    }

    @Test
    public void shouldFindPositiveDiagonalDifference(){
        int[][] arr = {{1,2,4}, {2,4,5}, {5,6,7}};
        System.out.println(Problem.diagonalDifference(arr));
    }
}
