package easy;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q453MinimumMovesToEqualArrayElements {
    public static void main(String[] args){
        int[] nums1={1,2,3};
        int[] nums2={3,2,4};
        int[] nums3={1,9};
        Q453MinimumMovesToEqualArrayElements object =new Q453MinimumMovesToEqualArrayElements();
        System.out.println(object.minMoves(nums2));


    }

    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        return sum-min*nums.length;
    }

}
