package test;

import org.junit.Test;
import problem.TapeEquilibrium;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 9.7.2016.
 */
public class TapeEquilibriumTest {
    @Test
    public void solution() throws Exception {
        TapeEquilibrium problem = new TapeEquilibrium();
        assertEquals(600,problem.solution(new int[]{-300,300}));
    }

}