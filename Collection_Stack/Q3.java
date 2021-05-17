import java.util.*;
public class Q3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int c=0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        for(int i=0;i<st.size();i++)
        {
            for(int j=0;j<st.size();j++)
            {
                if(st.get(i)+st.get(j)==k)
                c++;
            }
        }
        if(c>0)
        System.out.println("yes");
        else
        System.out.println("No");
    }
}
