// Brithday candies
// input=> 4
// 1 2 3 4
// output=> 1+2 =3 , 3+4=7, 7+4=10;
// 3+7+10=19
// output=19.
import java.util.*;
public class Q1_arr {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,sum1=0;
        ArrayList <Integer> al= new ArrayList<>();
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int [] arr = new int[a];
            for(int j=0;j<a;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int k=0;k<a;k++)
            {
                sum+=arr[k];
                al.add(sum);
            }
            for(int l=0;l<al.size();l++)
            {
                sum1+=al.get(l);
            }

            System.out.println(sum1-arr[0]);
        }
    }
}
