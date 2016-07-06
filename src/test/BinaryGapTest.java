package test;

import org.junit.Test;
import problem.BinaryGap;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 25.6.2016.
 */
public class BinaryGapTest {
    @Test
    public void solution() throws Exception {
        BinaryGap problem = new BinaryGap();
        assertEquals(problem.solution(1041),5);
        assertEquals(problem.solution(15),0);
        assertEquals(problem.solution(1),0);
        assertEquals(problem.solution(5),1);
        assertEquals(problem.solution(2147483647),0);
        assertEquals(problem.solution(6),0);
        assertEquals(problem.solution(328),2);
        assertEquals(problem.solution(16),0);
        assertEquals(problem.solution(1024),0);
        assertEquals(problem.solution(9),2);
        assertEquals(problem.solution(11),1);
        assertEquals(problem.solution(19),2);
        assertEquals(problem.solution(42),1);
        assertEquals(problem.solution(1162),3);
        assertEquals(problem.solution(51712),2);
        assertEquals(problem.solution(20),1);
        assertEquals(problem.solution(561892),3);
        assertEquals(problem.solution(66561),9);
        assertEquals(problem.solution(6291457),20);
        assertEquals(problem.solution(74901729),4);
        assertEquals(problem.solution(805306373),25);
        assertEquals(problem.solution(1376796946),5);
        assertEquals(problem.solution(1073741825),29);
        assertEquals(problem.solution(1610612737),28);
    }

}