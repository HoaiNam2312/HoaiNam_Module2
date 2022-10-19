package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class IllegalTriangleException {
    private int canhA, canhB, canhC;

    public IllegalTriangleException(int canhA, int canhB, int canhC)throws Exception{
        if (canhA <= 0 || canhB <= 0 || canhC <= 0 || canhA + canhB < canhC || canhB + canhC < canhA || canhA + canhC < canhB) {
            throw new Exception();
        }
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

}
