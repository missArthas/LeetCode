package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q516LongestPalindromicSubsequence {
    public static void main(String[] args){
        Q516LongestPalindromicSubsequence object = new Q516LongestPalindromicSubsequence();
        String str="9aeabcba92";
        System.out.println(object.longestPalindromeSubseq(str));
    }

    public int longestPalindromeSubseq(String s) {
        Integer[][] map=new Integer[s.length()][s.length()];
        return calu(s,0,s.length()-1,map);
    }

    private int calu(String s,int start,int end,Integer[][] map){
        if(map[start][end]!=null) return map[start][end];
        if(start>end) return 0;
        if(start==end) return 1;
        if(s.charAt(start)==s.charAt(end)){
            map[start][end]=calu(s,start+1,end-1,map)+2;
        }else{
            map[start][end]=Math.max(calu(s,start+1,end,map),calu(s,start,end-1,map));
        }
        return map[start][end];
    }

}
