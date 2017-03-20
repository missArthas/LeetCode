package easy;

/**
 * Created by shhuang on 2017/3/13.
 */
public class Q492ConstructTheRectangle {
    public static void main(String[] args){
        Q492ConstructTheRectangle object =new Q492ConstructTheRectangle();
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2={0,0,1,0,0,1};
        System.out.println(object.constructRectangle(3)[0]+" "+object.constructRectangle(3)[1]);
    }

    public int[] constructRectangle(int area) {
        int[] result=new int[2];
        result[0]=result[1]=(int)Math.sqrt(area);
        while(result[0]>=result[1]&&result[1]>0){
            if(result[0]*result[1]==area) return result;
            else if(result[0]*result[1]>area) result[1]--;
            else result[0]++;
        }
        return result;
    }
}
