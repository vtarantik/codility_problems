package problem;

/**
 * Created by vtarantik on 9.7.2016.
 * https://codility.com/demo/results/training9PBPHF-XSJ/
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distanceToGo = Y - X;
        int absSteps = distanceToGo / D;
        if (distanceToGo == 0 || distanceToGo < 0) {
            return 0;
        } else if (absSteps * D == distanceToGo) {
            return distanceToGo / D;
        } else {
            return distanceToGo / D + 1;
        }
    }
}
