import java.util.*;
public class Q2_pat {
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int c=1;
       
       for(int i=1;i<=a;i++)
       {
        for(int j=a;j>i;j--)
        {
            System.out.print(" ");
        }
           c=i;
           for(int j=0;j<i;j++)
           {
              System.out.print(c);
              c++;
           }
           c--;
           for(int k=1;k<i;k++)
           {
               c--;
               System.out.print(c);
           }
           System.out.println();
       }
    }
}
