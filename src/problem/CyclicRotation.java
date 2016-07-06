package problem;

/**
 * Created by vtarantik on 25.6.2016.
 * https://codility.com/demo/results/trainingX64R2M-FCC/
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length>0){

            int[] result = A;
            for(int i = 0;i<K;i++){
                result = rotateArrayByOne(result);
            }
            return result;
        }else{
            return new int[0];
        }
    }
    private int[] rotateArrayByOne(int[] A){
        int[] toReturn = new int[A.length];
        toReturn[0] = A[A.length-1];
        for(int i =0;i<A.length-1;i++){
            toReturn[i+1]=A[i];
        }
        return toReturn;
    }
}
