package problem;

/**
 * Created by vtarantik on 9.7.2016.
 * https://codility.com/demo/results/trainingGA8MKS-2WY/
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        if(A.length<2){
            return 0;
        }
        int smallest = Integer.MAX_VALUE;
        int arraySum = 0;
        int leftSideSum= 0;
        for(int i = 0;i<A.length;i++){
            arraySum+=A[i];
        }
        for(int j = 0;j<A.length-1;j++){
            leftSideSum += A[j];
            smallest = Math.min(Math.abs(leftSideSum-(arraySum-leftSideSum)),smallest);
        }
        return smallest;
    }
}
