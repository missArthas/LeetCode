package easy;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q67AddBinary {
    public static void main(String args[]){
        Q67AddBinary object=new Q67AddBinary();
        String a="1111";
        String b="1111";
        System.out.println(object.addBinary(a,b));
    }

    public String addBinary(String a, String b) {
        StringBuffer str=new StringBuffer();
        int lenA=a.length();
        int lenB=b.length();
        int i=lenA-1;
        int j=lenB-1;
        int flag=0;
        while(i>=0&&j>=0){
            int numA=a.charAt(i)-'0';
            int numB=b.charAt(j)-'0';
            int sumAB=numA+numB+flag;
            if(sumAB>=2) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%2));
            i--;
            j--;
        }
        while(i>=0){
            int numA=a.charAt(i)-'0';
            int sumAB=numA+flag;
            if(sumAB>=2) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%2));
            i--;
        }
        while(j>=0){
            int numB=b.charAt(j)-'0';
            int sumAB=numB+flag;
            if(sumAB>=2) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%2));
            j--;
        }
        if(flag==1) str.append("1");
        return str.reverse().toString();

    }
}
