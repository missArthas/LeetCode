package easy;

/**
 * Created by shhuang on 2017/3/7.
 */
public class Q344ReverseString {
    public static void main(String[] args){
        Q344ReverseString object =new Q344ReverseString();
        System.out.println(object.reverseString("hello"));
    }
    public String reverseString(String s) {
        StringBuffer str=new StringBuffer(s);
        return str.reverse().toString();
    }
}
