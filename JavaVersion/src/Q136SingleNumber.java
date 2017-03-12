
/**
 * Created by shhuang on 2017/3/10.
 */
public class Q136SingleNumber {

    public static void main(String[] args) {
        Q136SingleNumber object=new Q136SingleNumber();
        int[] nums={2,3,4,2,4};
        System.out.println(object.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        java.util.Hashtable<Integer,Integer> hashtable=new java.util.Hashtable<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hashtable.containsKey(nums[i])) hashtable.put(nums[i],1);
            else hashtable.put(nums[i],hashtable.get(nums[i])+1);
        }
        for(Integer k:hashtable.keySet()){
            if(hashtable.get(k)==1) return k;
        }
        return 0;
    }
}
