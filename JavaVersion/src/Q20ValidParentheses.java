/**
 * Created by shhuang on 2017/3/7.
 */
public class Q20ValidParentheses {
    public static void main(String[] args){
        Q20ValidParentheses object =new Q20ValidParentheses();
        System.out.print(object.isValid("{[()(){[]}]}"));
        System.out.print(object.isValid("]"));

    }

    public boolean isValid(String s) {
        java.util.Stack<Character> stack=new java.util.Stack<Character>();
        for(int i=0;i<s.length();++i){
            char t=s.charAt(i);
            if(t=='('||t=='['||t=='{') stack.push(t);
            else if(stack.empty()) return false;
            else{
                char match=stack.pop();
                if(t==')'&&match!='(') return false;
                if(t==']'&&match!='[') return false;
                if(t=='}'&&match!='{') return false;
            }
        }
        return stack.empty();
    }
}
