import java.util.Arrays;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q461HammingDistance {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 4;
        int degree = 0;//二进制中值为1的个数
        int a =2147483647;
        a=a+1;
//        for(int i=0;i<32;i++){
//            if(((1<<i)&number1)!=0){
//                degree++;
//            }
//        }
//        int[] array1 = new int[degree];
//        int index = 0;
//        for(int i=0;i<32;i++){
//            if(((1<<i)&number1)!=0){
//                array1[index++]=(1<<i);
//            }
//        }
//        System.out.println(degree);


//        int[] array1=bits(number1);
//        System.out.println(Arrays.toString(array1));
    }

    public static int[] bits(int num){
        int degree = 0;//二进制中值为1的个数
        for(int i=0;i<32;i++){
            if(((1<<i)&num)!=0){
                degree++;
            }
        }
        int[] array1 = new int[degree];
        int index = 0;
        for(int i=0;i<32;i++){
            if(((1<<i)&num)!=0){
                array1[index++]=(1<<i);
            }
        }
        return array1;
    }
}
