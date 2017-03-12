import java.util.List;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q496NextGreaterElement {
    public static void main(String[] args) {
        Q496NextGreaterElement object =new Q496NextGreaterElement();
        int[] findNums={2,4};
        int[] nums={1,2,3,4};
        int[] result=object.nextGreaterElement(findNums,nums);
        for(int i:result){
            System.out.println(i);
        }
    }

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result=new int[findNums.length];
        for(int i=0;i<findNums.length;i++){
            int t=-1;
            int j;
            for(j=0;j<nums.length;j++){
                if(nums[j]==findNums[i]) break;
            }
            for(j++;j<nums.length;j++){
                if(nums[j]>findNums[i]) {
                    t=nums[j];
                    break;
                }
            }
            result[i]=t;
        }
        return result;
    }
}
