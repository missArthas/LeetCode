package easy;

/**
 * Created by shhuang on 2017/3/12.
 */
public class Q292NimGame {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9, 8, 10, 11, 9};
        Q292NimGame object = new Q292NimGame();
        System.out.println(object.canWinNim(5));
    }

    public boolean canWinNim(int n) {
        if(n%4==0) return false;
        else return true;

    }
}
