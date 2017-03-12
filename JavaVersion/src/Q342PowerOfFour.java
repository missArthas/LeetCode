/**
 * Created by shhuang on 2017/3/12.
 */
public class Q342PowerOfFour {
    public static void main(String[] args){
        int i=1;
        while(i*4>0)
            i*=4;
        System.out.println(i);
        Q342PowerOfFour object = new Q342PowerOfFour();
        System.out.println(object.isPowerOfFour(16));
    }
    public boolean isPowerOfFour(int num) {
        if(num<=0) return false;
        return ((1073741824%num==0)&&((num-1)%3==0));
    }
}
