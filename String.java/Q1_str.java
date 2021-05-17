import java.util.*;
public class Q1_str {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String s1 = sc.nextLine();
        char ch =s1.charAt(0);
        for(int i=0;i<s1.length();i++)
        {
            if(ch==s1.charAt(i))
            {
                count++;
            }
            else
            {
                System.out.print(count+""+ch+" ");
                ch=s1.charAt(i);
                count=1;
            }
            
        }
         System.out.print(count+""+ch);

    }
    
}
