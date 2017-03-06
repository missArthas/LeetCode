/**
 * Created by shhuang on 2017/3/6.
 */
public class Q1TwoSum {
    public static void main(String[] args){
        int[] nums={3,2,4};
        int target=6;
        int[] result=twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);


    }
    public int[] twoSum1(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=0;
        result[1]=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==target){
                result[0]=result[1]=i;
                break;
            }
            for(int j=i+1;j<nums.length;j++){
                if(sum+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }else if(sum+nums[j]>target)break;
                else sum=sum+nums[j];
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=0;
        result[1]=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
