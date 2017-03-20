package easy;

/**
 * Created by shhuang on 2017/3/13.
 */
public class Q283MoveZeros {
    public static void main(String[] args) {
        Q283MoveZeros object = new Q283MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0, 0, 1, 0, 0, 1};
        int[] nums3 = {1, 2, 3};
        object.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }

    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0) return ;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) nums[index++]=nums[i];
        }

        while (index<nums.length){
            nums[index++]=0;
        }
    }

//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int j = 0;
//            while (j < nums.length - i && nums[j] != 0) j++;
//            if (j == nums.length - i) return;
//
//            for (; j < nums.length - i - 1; j++) {
//                int t = nums[j + 1];
//                nums[j + 1] = nums[j];
//                nums[j] = t;
//            }
//        }
//    }
}
