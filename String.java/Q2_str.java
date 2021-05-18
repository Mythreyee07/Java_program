import java.util.*;
public class Q2_str {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int c=0;
        char ch = '1';
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a=s1.length();
        int b =s2.length();
        int d = b-a;
        String s3 ="";
        
        int i=0,j=0;
        if(s1.length()<s2.length())
        {
            for(int k=0;k<d;k++)
            {
                s1=s1+ch;
            }
        }
         // System.out.println(s1);
        if(s1.length()>s2.length())
        {
                 s2=s2.substring(0,b);
                 c=s1.length()-s2.length();
        }
       // System.out.println(s2);

        while(i<s1.length() && j<s2.length())
        {
            if(s1.charAt(i)!=s2.charAt(j))
            {
            c++;
            }
            i++;
            j++;
        }
        System.out.println(c);
    }
    
}
