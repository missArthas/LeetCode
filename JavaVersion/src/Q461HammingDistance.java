import java.util.Arrays;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q461HammingDistance {

    public static void main(String[] args) {
        Q461HammingDistance object=new Q461HammingDistance();
        System.out.println(object.hammingDistance(3,6));
    }

    public int hammingDistance(int x, int y) {
        int nums=0;
        while(x!=0||y!=0){
            int t1=x%2;
            int t2=y%2;
            if(t1!=t2) nums++;
            x/=2;
            y/=2;
        }
        return nums;
    }
}
