/**
 * Created by shhuang on 2017/3/11.
 */
public class Q190ReverseBits {
    public static void main(String[] args){
        Q190ReverseBits object =new Q190ReverseBits();
        System.out.println(object.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        int r=n&-1;
        if(r<0) r+=2147483647+1+2147483647+1;
        return r;
    }
}
