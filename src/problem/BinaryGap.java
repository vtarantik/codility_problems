package problem;

public class BinaryGap {
    //https://codility.com/demo/results/trainingEXT4TF-Y8D/

    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        int gapSize = 0;
        int biggestGap = 0;
        boolean oneFound = false;
        boolean insideGap = false;
        boolean gapEnclosed = false;
        if (binary.length() == 0 || binary.charAt(0) != '1') {
            return 0;
        } else {
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                    oneFound = true;
                    if (insideGap) {
                        insideGap = false;
                        gapEnclosed = true;
                        if (gapSize > biggestGap) {
                            biggestGap = gapSize;
                        }
                        gapSize = 0;
                    }
                } else if (binary.charAt(i) == '0') {
                    if (oneFound) {
                        insideGap = true;
                    }
                    oneFound = false;
                    if (insideGap) {
                        gapSize += 1;
                    }
                }
            }
        }
        return biggestGap;

    }
}
