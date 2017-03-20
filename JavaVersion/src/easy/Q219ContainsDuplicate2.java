package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q219ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9, 8, 10, 11, 9};
        int[] nums2 = {9, 9};
        Q219ContainsDuplicate2 object = new Q219ContainsDuplicate2();
        System.out.println(object.containsNearbyDuplicate(nums, 4));
    }

        public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<=k&&i+j<nums.length;j++){
                if(nums[i]==nums[i+j]) return true;
            }
        }
        return false;
    }
}
