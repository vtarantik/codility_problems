package test;

import problem.CyclicRotation;

import static org.junit.Assert.*;

/**
 * Created by vtarantik on 25.6.2016.
 */
public class CyclicRotationTest {
    @org.junit.Test
    public void solution() throws Exception {
        CyclicRotation algorithm = new CyclicRotation();
        assertArrayEquals(new int[]{9, 7, 6, 3, 8},algorithm.solution(new int[]{3,8,9,7,6},3));
    }

}