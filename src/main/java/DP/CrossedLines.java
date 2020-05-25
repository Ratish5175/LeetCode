package DP;

public class CrossedLines {
    public static void main(String[] args) {
        int [] A ={1};
                //{1,4,2};
                //{1,3,7,1,7,5};

                //{2,5,1,2,5};
        int [] B ={1,3};
                //{1,2,4};
                //{1,9,2,5,1};
                //{10,5,2,1,5,2};
        CrossedLines crossedLines = new CrossedLines();
        System.out.println(crossedLines.maxUncrossedLines(A,B));

    }
    public int maxUncrossedLines(int[] A, int[] B) {
        int [][] dp = new int [A.length+1][B.length+1];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=A.length;i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}
