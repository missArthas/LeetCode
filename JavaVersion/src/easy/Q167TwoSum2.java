package easy;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q167TwoSum2 {
    public static void main(String[] args) {
        Q167TwoSum2 object=new Q167TwoSum2();
        //int[] nums={2,3,5,7,9,11,13,20};
        int[] nums={12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,
                180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365
                ,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,
                506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,
                764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,
                927,930,933,957,981,997};

        int target=542;
        int[] result = object.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);



    }


    public  int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        for (int i = 0; i < numbers.length; i++) {
            result[0]=i+1;
            int nextTarget=target-numbers[i];
            int searchResult=binarySearch(numbers,i+1,numbers.length-1,nextTarget);
            if(searchResult==-1) continue;
            else {
                result[1]=searchResult+1;
                break;
            }
        }
        return result;
    }

    public int binarySearch(int[] numbers,int start,int end,int target){
        if(start>=end){
            if(numbers[start]==target) return start;
            else return -1;
        }
        int position=0;
        int mid=(start+end)/2;
        if(numbers[mid]==target) return mid;
        else if(numbers[mid]>target) return binarySearch(numbers,start,mid-1,target);
        else if(numbers[mid]<target) return binarySearch(numbers,mid+1,end,target);
        else return -1;
    }
}
