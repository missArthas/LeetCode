package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q326PowerOfThree {
    public static void main(String[] args){
        int i=1;
        while(i*3>0)
            i*=3;
        System.out.println(i);
        Q326PowerOfThree object = new Q326PowerOfThree();
        System.out.println(object.isPowerOfThree(9));
    }
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        return 1162261467%n==0;
    }
}
