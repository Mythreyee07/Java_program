// Given the series as follows 1 2 3 4 8 16 32 64.... Identify the nth term of the series.
import java.util.*;
public class Q1 {
    static int toFindNterm(int n){
        int iRes=1;
        for(int i=1;i<n;i++){
            iRes=iRes*2;
        }
        return iRes;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int iTerm=sc.nextInt();
        System.out.println(toFindNterm(iTerm));
    }
}
