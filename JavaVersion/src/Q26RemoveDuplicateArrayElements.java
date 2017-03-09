/**
 * Created by shhuang on 2017/3/9.
 */
public class Q26RemoveDuplicateArrayElements {
    public static void main(String args[]){
        Q26RemoveDuplicateArrayElements object = new Q26RemoveDuplicateArrayElements();
        int[] nums={};
        int result=object.removeDuplicates(nums);
        System.out.println(result);
    }


    public int removeDuplicates(int[] nums) {
        int stepsLength=0;
        int categroy=0;
        int length=nums.length;
        if(length==0) return 0;
        int val=nums[0];
        for(int i=0;i<length;i++){
            if(nums[i]==val) continue;
            else{
                categroy++;
                nums[categroy]=nums[i];
                val=nums[categroy];
            }
        }
        return categroy+1;
    }
}
