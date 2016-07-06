package problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by vtarantik on 25.6.2016.
 * https://codility.com/demo/results/trainingZQABGF-F7G/
 */
public class OddOcurences {
        public int solution(int[] A) {
            // write your code in Java SE 8
            if (A.length == 1) {
                return A[0];
            } else {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < A.length; i++) {
                    if (map.get(A[i]) != null) {
                        map.remove(A[i]);
                    } else {
                        map.put(A[i], A[i]);
                    }
                }
                if (map.keySet().size() != 1) {
                    throw new IllegalArgumentException();
                }
                return (int) map.keySet().toArray()[0];
            }
        }
}
