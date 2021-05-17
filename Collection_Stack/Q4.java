import java.util.*;
public class Q4 {

    static void occurance(Stack<Integer> st , int n)
    {
         int count=0;
         String s1 = String.valueOf(n);
         for(int i=0;i<st.size();i++)
         {
             if(String.valueOf(st.get(i)).contains(s1))
             count++;
         }
         System.out.println("Number of time the value "+n+" occured is : "+count);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        for(int i=l;i<r;i++)
        {
            st.push(i);
        }
        occurance(st, n);

    }
    
}
