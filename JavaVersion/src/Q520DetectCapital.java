
/**
 * Created by shhuang on 2017/3/12.
 */
public class Q520DetectCapital {
    public static void main(String[] args) {
        String[] strings={"USA","abc","Google","ErrO"};
        Q520DetectCapital object = new Q520DetectCapital();
        for(String str:strings)
            System.out.println(object.detectCapitalUse(str));
    }

    public boolean detectCapitalUse(String word) {
        int len=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z') len++;
        }
        if(len==word.length()||len==0) return true;
        if(word.charAt(0)>='A'&&word.charAt(0)<='Z'&&len==1) return true;
        return false;
    }
}
