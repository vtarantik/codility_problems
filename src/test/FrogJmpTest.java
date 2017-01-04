package test;

import org.junit.Test;
import problem.FrogJmp;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 9.7.2016.
 */
public class FrogJmpTest {
    @Test
    public void solution() throws Exception {
        FrogJmp problem = new FrogJmp();
        assertEquals(3,problem.solution(10,85,30));
        assertEquals(3,problem.solution(10,100,30));
        assertEquals(0,problem.solution(10,10,30));
        assertEquals(0,problem.solution(10,5,60));
    }

}