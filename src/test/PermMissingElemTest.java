package test;

import org.junit.Test;
import problem.PermMissingElem;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 9.7.2016.
 */
public class PermMissingElemTest {
    @Test
    public void solution() throws Exception {
        PermMissingElem problem = new PermMissingElem();
        assertEquals(1,problem.solution(new int[]{}));
        assertEquals(2,problem.solution(new int[]{1}));
        assertEquals(2,problem.solution(new int[]{1,3}));
        assertEquals(3,problem.solution(new int[]{1,2}));
    }

}