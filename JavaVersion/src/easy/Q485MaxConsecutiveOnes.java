package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q485MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,0,1,1,0,1,1,1,1};
        Q485MaxConsecutiveOnes object = new Q485MaxConsecutiveOnes();
        System.out.println(object.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int now=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                now++;
                if(now>=max) max=now;
            }else now=0;
        }
        return max;
    }
}
