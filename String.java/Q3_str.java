// Design a palindromic word from the given string by inserting the fewest number of new characters (that is already present) in the string at required
// positions.
// For example, 
// Input: race
// Output: ecarace
// Sample Input        Sample Output
// race                              ecarace

import java.util.*;
public class Q3_str {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int c=0;
        String s1 = sc.next();
        String s2="";
        s2+=s1;
        for(int i=1;i<s1.length();i++)
        {
            String rev="";
            s2=s1.charAt(i)+s2;
            for ( int j =s2.length()-1; j >= 0; j-- )
            {
            rev = rev + s2.charAt(j);
            }
            if (s2.equals(rev))
            System.out.println(s2+" is a palindrome");
            else
           // System.out.println(rev+" "+s2);
             System.out.println(s2+" is not a palindrome");
            
 
        }

    }
    
}
