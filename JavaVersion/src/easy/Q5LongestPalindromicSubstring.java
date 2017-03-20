package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q5LongestPalindromicSubstring {
    public static void main(String[] args){
        Q5LongestPalindromicSubstring object = new Q5LongestPalindromicSubstring();
        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(object.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        String max=s.charAt(0)+"";
        for(int i=1;i<s.length()-1;i++){
            String temp=expand(s,i,i);
            if(temp.length()>max.length()) max=temp;
        }
        for(int i=0;i<s.length()-1;i++){
            String temp=expand(s,i,i+1);
            if(temp.length()>max.length()) max=temp;
        }
        return max;
    }

    public String expand(String s,int start,int end){
        if(s.charAt(start)!=s.charAt(end)) return "";
        int i,j;
        i=start;
        j=end;
        String max=s.substring(start,end+1);
        while(i>0&&j<s.length()-1){
            i--;
            j++;
            if(s.charAt(i)==s.charAt(j)){
                if(s.substring(i,j).length()>max.length()) max=s.substring(i,j+1);
                else continue;
            }else break;
        }
        return max;
    }

//    private String caluString(String s,int start,int end,String[][] map){
//        if(map[start][end]!=null) return map[start][end];
//        if(start>end) return "";
//        if(start==end) return s.charAt(start)+"";
//        if(s.charAt(start)==s.charAt(end)){
//            map[start][end]=s.charAt(start)+caluString(s,start+1,end-1,map)+s.charAt(end);
//        }else{
//            String str1=caluString(s,start+1,end,map);
//            String str2=caluString(s,start,end-1,map);
//            if(str1.length()>str2.length()) map[start][end]=str1;
//            else map[start][end]=str2;
//        }
//        return map[start][end];
//    }
}
