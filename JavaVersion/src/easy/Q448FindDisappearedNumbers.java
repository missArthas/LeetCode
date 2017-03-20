package easy;

import java.util.List;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q448FindDisappearedNumbers {

    public static void main(String[] args) {
        Q448FindDisappearedNumbers object=new Q448FindDisappearedNumbers();
        int[] nums={4,3,2,7,8,2,3,1};
        for(Integer i:object.findDisappearedNumbers(nums))
            System.out.println(i);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new java.util.ArrayList<Integer>();
        int[] map=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        for(int i=1;i<map.length;i++) if(map[i]==0) result.add(i);
        return result;
    }
}
