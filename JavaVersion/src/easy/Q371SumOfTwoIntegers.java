package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q371SumOfTwoIntegers {
    public static void main(String[] args) {
        Q371SumOfTwoIntegers object = new Q371SumOfTwoIntegers();
        int a =3;
        int b=1;
        System.out.println(object.getSum(a,b));
    }

    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        int x=a^b;
        int y=(a&b)<<1;
        return getSum(x,y);
    }

}
