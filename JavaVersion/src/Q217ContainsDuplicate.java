/**
 * Created by shhuang on 2017/3/13.
 */
public class Q217ContainsDuplicate {
    public static void main(String[] args){
        Q217ContainsDuplicate object =new Q217ContainsDuplicate();
        int[] nums={1,2,3};
        System.out.println(object.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> set = new java.util.HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)) return true;
            else set.add(i);
        }
        return false;
    }
}
