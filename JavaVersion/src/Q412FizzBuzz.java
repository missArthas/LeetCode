import java.util.List;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q412FizzBuzz {
    public static void main(String[] args) {
        Q412FizzBuzz object =new Q412FizzBuzz();
        List<String> result=object.fizzBuzz(15);
        for(String str:result){
            System.out.println(str);
        }
    }

    public List<String> fizzBuzz(int n) {
        java.util.ArrayList<String> result=new java.util.ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0) result.add("FizzBuzz");
            else if(i%3==0) result.add("Fizz");
            else if(i%5==0) result.add("Buzz");
            else result.add(i+"");
        }
        return result;
    }
}
