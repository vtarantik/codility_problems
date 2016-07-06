package test;

import org.junit.Test;
import problem.OddOcurences;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 25.6.2016.
 */
public class OddOcurencesTest {
    @Test
    public void solution() throws Exception {
        OddOcurences problem = new OddOcurences();
        assertEquals(problem.solution(new int[]{9}),9);
        assertEquals(problem.solution(new int[]{9,3,9,3,9,7,9}),7);
    }

}