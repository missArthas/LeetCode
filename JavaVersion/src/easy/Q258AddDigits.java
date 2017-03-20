package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q258AddDigits {
    public static void main(String[] args) {
        Q258AddDigits object = new Q258AddDigits();
        System.out.println(object.addDigits(0));
    }

    public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        if(sum>=10) return addDigits(sum);
        else return sum;
    }
}
