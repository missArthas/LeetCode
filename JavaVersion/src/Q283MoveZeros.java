/**
 * Created by shhuang on 2017/3/13.
 */
public class Q283MoveZeros {
    public static void main(String[] args){
        Q283MoveZeros object =new Q283MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2={0,0,1,0,0,1};
        object.moveZeroes(nums2);
        for(int i=0;i<nums2.length;i++)
            System.out.println(nums2[i]);
    }

    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int len=0;
                while(nums[i+len]==0)
                    len++;
                for(int j=i;j<nums.length-i-1;j++){
                    int t=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=t;
                }
            }
        }
    }
}
