import java.util.*;
public class Q1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int j=1;j<=a;j++)
        {
        for(int i=a;i>0;i--)
        {
            if(i!=j)
            System.out.print(i);
            else
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
