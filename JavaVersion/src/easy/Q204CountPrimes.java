package easy;

/**
 * Created by shhuang on 2017/3/13.
 */
public class Q204CountPrimes {
    public static void main(String[] args){
        Q204CountPrimes object =new Q204CountPrimes();
        System.out.println(object.countPrimes(4));

    }

    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        if(n==2) return 0;
        if(n==3) return 1;
        int[] table=new int[n+1];
        int result=0;
        for(int i=2;i<n;i++) table[i]=1;
        table[0]=0;
        table[1]=0;
        table[2]=1;
        table[3]=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=2;i*j<n;j++){
                table[i*j]=0;
            }
        }
        for(int i=2;i<n;i++)
            result+=table[i];
        return result;
    }
}
