package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q476NumberComplement {
    public static void main(String[] args){
        Q476NumberComplement object = new Q476NumberComplement();
        System.out.println(object.findComplement(5));
    }

    public int findComplement(int num) {
        int[] array=new int[33];
        int length=0;
        int r=0;
        int multiple2=1;
        for(length=0;num>0;length++){
            array[length]=num%2;
            num/=2;
        }
        for(int i=0;i<length;i++){
            r=r+(array[i]^1)*multiple2;
            multiple2*=2;
        }
        return r;
    }
}
