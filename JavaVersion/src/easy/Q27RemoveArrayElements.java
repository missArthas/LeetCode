package easy;

/**
 * Created by shhuang on 2017/3/9.
 */
public class Q27RemoveArrayElements {
    public static void main(String args[]){
        Q27RemoveArrayElements object = new Q27RemoveArrayElements();
        int[] nums={3,2,2,3};
        int result=object.removeElement(nums,3);
        System.out.println(result);
    }


    public int removeElement(int[] nums, int val) {
        int i,j;
        int length=nums.length;
        for(i=0,j=0;i<length;i++){
            if(nums[i]==val) {
                for(int t=i+1;t<length;t++){
                    nums[t-1]=nums[t];
                }
                length--;
                i=-1;
            }

        }
        return length;
    }
}
