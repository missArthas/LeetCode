/**
 * Created by shhuang on 2017/3/6.
 */
public class Q415AddStrings {
    public static void main(String args[]){
        Q415AddStrings object=new Q415AddStrings();
        String a="1";
        String b="9";
        System.out.println(object.addStrings(a,b));
    }

    public String addStrings(String num1, String num2) {
        StringBuffer str=new StringBuffer();
        int lenA=num1.length();
        int lenB=num2.length();
        int i=lenA-1;
        int j=lenB-1;
        int flag=0;
        while(i>=0&&j>=0){
            int numA=num1.charAt(i)-'0';
            int numB=num2.charAt(j)-'0';
            int sumAB=numA+numB+flag;
            if(sumAB>=10) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%10));
            i--;
            j--;
        }
        while(i>=0){
            int numA=num1.charAt(i)-'0';
            int sumAB=numA+flag;
            if(sumAB>=10) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%10));
            i--;
        }
        while(j>=0){
            int numB=num2.charAt(j)-'0';
            int sumAB=numB+flag;
            if(sumAB>=10) flag=1;
            else flag=0;
            str.append(String.valueOf(sumAB%10));
            j--;
        }
        if(flag==1) str.append("1");
        return str.reverse().toString();
    }
}
