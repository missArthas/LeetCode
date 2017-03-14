
/**
 * Created by shhuang on 2017/3/12.
 */
public class Q220ContainsDuplicate3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9, 8, 10, 11, 9};
        int[] nums2 = {9, 9};
        Q220ContainsDuplicate3 object = new Q220ContainsDuplicate3();
        System.out.println(object.containsNearbyAlmostDuplicate(nums, 4,2));
    }

    //    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=1;j<=k&&i+j<nums.length;j++){
//                if(nums[i]==nums[i+j]) return true;
//            }
//        }
//        return false;
//    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        return true;
    }
}
