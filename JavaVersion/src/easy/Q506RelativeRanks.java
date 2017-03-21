package easy;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q506RelativeRanks {
    public static void main(String args[]){
        Q506RelativeRanks object=new Q506RelativeRanks();
        int[] nums={6,10,1,8,2};
        String[] result=object.findRelativeRanks(nums);
        for(String str:result){
            System.out.println(str);
        }
    }

    public String[] findRelativeRanks(int[] nums) {
        String[] result=new String[nums.length];
        int[] rank=nums.clone();
        java.util.Arrays.sort(rank);
        for(int i=rank.length-1;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==rank[i]) {
                    result[j]=nums.length-i+"";
                    if(result[j].equals("1")) result[j]="Gold Medal";
                    else if(result[j].equals("2")) result[j]="Silver Medal";
                    else if(result[j].equals("3")) result[j]="Bronze Medal";
                    break;
                }
            }
        }
        return result;
    }
}

