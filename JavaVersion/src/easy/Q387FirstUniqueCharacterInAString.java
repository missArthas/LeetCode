package easy;

/**
 * Created by shhuang on 2017/3/23.
 */
public class Q387FirstUniqueCharacterInAString {
    public static void main(String[] args){
        Q387FirstUniqueCharacterInAString object =new Q387FirstUniqueCharacterInAString();
        System.out.println(object.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        int[] map=new int[27];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }

//    public int firstUniqChar(String s) {
//
//        java.util.HashMap<Character,Integer> map=new java.util.HashMap<Character,Integer>();
//        for(int i=0;i<s.length();i++){
//            char t=s.charAt(i);
//            if(map.containsKey(t)) map.put(t,map.get(t)+1);
//            else map.put(t,1);
//        }
//        for(int i=0;i<s.length();i++){
//            if(map.get(s.charAt(i))==1) return i;
//        }
//        return -1;
//    }

}
