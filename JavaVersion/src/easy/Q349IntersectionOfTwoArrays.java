package easy;

import java.util.HashSet;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Q349IntersectionOfTwoArrays object = new Q349IntersectionOfTwoArrays();
        int[] nums1={1,2,3,2};
        int[] nums2={2,6,7,8,2,3};
        int[] result=object.intersection(nums1,nums2);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        set1.retainAll(set2);
        int[] result=new int[set1.size()];
        int index=0;
        for(Integer t:set1){
            result[index++]=t;
        }
        return result;
    }

}
