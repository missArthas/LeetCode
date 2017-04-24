package easy;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class Q561ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Q561ArrayPartition1 object=new Q561ArrayPartition1();
        int[] t={2,3,1,4};
        System.out.println(object.arrayPairSum(t));
    }
}
