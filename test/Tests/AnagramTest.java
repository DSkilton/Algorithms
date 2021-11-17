
package Tests;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author MC03353
 */
public class AnagramTest {
    
    @Test
    public void anagramSolutionTest(){
        Assert.assertEquals("message", true, true);
        assertEquals(algorithms.Anagram.anagramSolution("cake", "cake"), true);
    }

    
}
