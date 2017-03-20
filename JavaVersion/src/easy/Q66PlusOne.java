package easy;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q66PlusOne {
    public static void main(String args[]){
        Q66PlusOne object=new Q66PlusOne();
        int[] digits={0};
        int[] result=object.plusOne(digits);
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]);
    }

    public int[] plusOne(int[] digits) {
        int tmpDigits[]=new int [digits.length+1];
        for(int i=1;i<=digits.length;i++) tmpDigits[i]=digits[i-1];
        tmpDigits[0]=0;
        int flag=0;
        tmpDigits[digits.length]+=1;
        for(int i=tmpDigits.length-1;i>=0;i--){
            if(tmpDigits[i]>=10) {
                tmpDigits[i]=tmpDigits[i]%10;
                tmpDigits[i-1]+=1;
            }
        }
        if(tmpDigits[0]==1) return tmpDigits;
        else {
            int result[]=new int [digits.length];
            for(int i=0;i<digits.length;i++) result[i]=tmpDigits[i+1];
            return result;
        }
    }
}
