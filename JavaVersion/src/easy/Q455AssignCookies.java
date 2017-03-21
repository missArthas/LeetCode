package easy;

/**
 * Created by shhuang on 2017/3/21.
 */
public class Q455AssignCookies {
    public static void main(String[] args){
        int[] g={1,2};
        int[] s={1,2,3};
        Q455AssignCookies object =new Q455AssignCookies();
        System.out.println(object.findContentChildren(g,s));

    }

    public int findContentChildren(int[] g, int[] s) {
        int index=0;
        java.util.Arrays.sort(g);
        java.util.Arrays.sort(s);
        for(int i=0;i<s.length&&index<g.length;i++){
            if(s[i]>=g[index]) {
                index++;
            }
        }
        return index;
    }
}
