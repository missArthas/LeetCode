package easy;

/**
 * Created by shhuang on 2017/3/13.
 */
public class Q263UglyNumber {
    public static void main(String[] args){
        Q263UglyNumber object =new Q263UglyNumber();
        System.out.println(object.isUgly(6));
    }

    public boolean isUgly(int num) {
        if(num==0) return false;
        if(num==1) return true;
        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
}
