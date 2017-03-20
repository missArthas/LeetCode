package easy;

/**
 * Created by shhuang on 2017/3/11.
 */
public class Q231PowerOfTwo {
    public static void main(String[] args){
        Q231PowerOfTwo object = new Q231PowerOfTwo();
        System.out.println(object.isPowerOfTwo(3));
    }

    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int result=n&(n-1);
        if(result==0) return true;
        else return false;
    }
}
