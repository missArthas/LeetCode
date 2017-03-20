package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q191NumberOfBit1 {

    public static void main(String[] args) {
        Q191NumberOfBit1 object=new Q191NumberOfBit1();
        int input=2147483647;
        System.out.println(object.hammingWeight(input+2));
    }

    public int hammingWeight(int n) {
        int nums=0;
        if(n<0) {
            n=n+2147483647+1;
            nums++;
        }
        while(n!=0){
            if(n%2==1) nums++;
            n/=2;
        }
        return nums;
    }
}
