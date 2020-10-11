package task2.ex2;

public class MaxFromMin {

    public int checkMinAorB(int x, int y ) {
        if(x <= y){
            return x;
        } else {
            return y;
        }
    }

    public int checkMax( int minAb, int minCd ) {
        if(minAb <= minCd){
            return minCd;
        } else {
            return minAb;
        }
    }
}
