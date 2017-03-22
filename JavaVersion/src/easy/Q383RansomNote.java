package easy;


import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by shhuang on 2017/3/6.
 */
public class Q383RansomNote {
    public static void main(String args[]){
        Q383RansomNote object=new Q383RansomNote();
        String a="ab";
        String b="aab";
        System.out.println(object.canConstruct(a,b));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> str=new HashMap<Character,Integer>();
        boolean flag=true;
        for(int i=0;i<magazine.length();i++){
            char t=magazine.charAt(i);
            if(str.containsKey(t)) str.put(t,str.get(t)+1);
            else str.put(t,1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char t=ransomNote.charAt(i);
            if(!str.containsKey(t)) {flag=false;break;}
            else if(str.get(t)<1) {flag=false;break;}
            else if(str.get(t)>=1) {
                str.put(t,str.get(t)-1);
            }
        }
        return flag;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        if(ransomNote.length()>magazine.length()) return false;
//
//        StringBuffer str1=new StringBuffer(ransomNote);
//        StringBuffer str2=new StringBuffer(magazine);
//        int len=ransomNote.length();
//        for(int i=0;i<len;i++){
//            char target=str1.charAt(0);
//            int flag=1;
//            for(int j=0;j<str2.length();j++){
//                if(target==str2.charAt(j)){
//                    str1.deleteCharAt(0);
//                    str2.deleteCharAt(j);
//                    flag=0;
//                    break;
//                }
//            }
//            if(flag==1) break;
//        }
//        if(str1.length()==0) return true;
//        else return false;
//    }
}
