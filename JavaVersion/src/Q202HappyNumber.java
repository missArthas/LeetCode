import java.util.ArrayList;

/**
 * Created by shhuang on 2017/3/13.
 */
public class Q202HappyNumber {
    public static void main(String[] args){
        Q202HappyNumber object =new Q202HappyNumber();
        System.out.println(object.isHappy(6));
    }

    public boolean isHappy(int n) {
        if(calc(n)==1) return true;
        else return false;
    }

    public int calc(int n){
        //4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
        int t=n;
        int result=0;
        java.util.List list=new java.util.ArrayList();
        while(t!=0){
            list.add(t%10);
            t/=10;
        }
        for(int i=0;i<list.size();i++){
            result+=((int)list.get(i)*(int)list.get(i));
        }
        if(result==n) return result;
        else return calc(result);
    }

}
