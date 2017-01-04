package problem;

/**
 * Created by vtarantik on 9.7.2016.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        } else if (A.length == 1) {
            return A[0] - 1;
        } else if (A.length == 2) {
            int min = Math.min(A[0], A[1]);
            if ((min == A[0] && min + 1 == A[1]) || (min == A[1] && min + 1 == A[0])) {
                return min-1;
            } else {
                return min + 1;
            }
        } else {
            int actualSum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                min = Math.min(min, A[i]);
                actualSum += A[i];
            }
            int expectedSum = 0;
            for (int j = min; j <= A.length + 1; j++) {
                expectedSum += j;
            }
            int result = expectedSum - actualSum;
            if (result == 0) {
                return 1;
            } else {
                return expectedSum - actualSum;
            }

        }
    }
}
