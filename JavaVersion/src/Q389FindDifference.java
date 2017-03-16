
/**
 * Created by shhuang on 2017/3/10.
 */
public class Q389FindDifference {
    public static void main(String[] args) {
        Q389FindDifference object = new Q389FindDifference();
        String s = "cddba";
        String t = "abcddd";
        System.out.println(object.findTheDifference(s, t));
    }

    //    public char findTheDifference(String s, String t) {
//        java.util.HashMap<Character,Integer> map=new java.util.HashMap<Character, Integer>();
//        for(int i=0;i<s.length();i++){
//            char temp=s.charAt(i);
//            if(map.containsKey(temp)) map.put(temp,map.get(temp)+1);
//            else map.put(temp,1);
//        }
//        for(int i=0;i<t.length();i++){
//            char temp=t.charAt(i);
//            if(!map.containsKey(temp)||map.get(temp)==0) return temp;
//            else map.put(temp,map.get(temp)-1);
//        }
//        return 'c';
//    }
    public char findTheDifference(String s, String t) {
        int ssum=0;
        int tsum=0;
        for(int i=0;i<s.length();++i) ssum+=(int)s.charAt(i);
        for(int i=0;i<t.length();++i) tsum+=(int)t.charAt(i);
        int result=tsum-ssum;
        return (char)result;
    }

}
