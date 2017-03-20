package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q500KeyboardRow {
    public static void main(String[] args){
        String[] strings={"Hello", "Alaska", "Dad", "Peace"};
        Q500KeyboardRow object = new Q500KeyboardRow();
        String[] result=object.findWords(strings);
        for(String str:result){
            System.out.println(str);
        }
    }

    public String[] findWords(String[] words) {
        String[] regExs={"[qwertyuiop]{1,}","[asdfghjkl]{1,}","[zxcvbnm]{1,}"};
        String[] save=new String[words.length];
        int len=0;
        for(String str:words){
            for(int j=0;j<3;j++){
                java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regExs[j], java.util.regex.Pattern.CASE_INSENSITIVE);
                java.util.regex.Matcher matcher = pattern.matcher(str);
                boolean rs = matcher.matches();
                if(rs==true) {
                    save[len]=str;
                    len++;
                    break;
                }
            }
        }
        String[] result=new String[len];
        for(int i=0;i<len;i++) result[i]=save[i];
        return result;
    }
}
