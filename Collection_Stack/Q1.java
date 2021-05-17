import java.util.*;
public class Q1 {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int j=0;
		    String s= sc.nextLine();
		    char[] a=s.toCharArray();
		    Stack<Character> st=new Stack<Character>();
		    for(j=0;j<a.length;j++)
		    {
		        if(a[j]=='['||a[j]=='('||a[j]=='{')
		            st.push(a[j]);
		        else if(a[j]==']'||a[j]==')'||a[j]=='}')
		        {
					
		            if(st.peek()=='['&& a[j]==']')
		                st.pop();
		            else
		            if(st.peek()=='('&& a[j]==')')
		                st.pop();
		            else
		            if(st.peek()=='{'&& a[j]=='}')
		                st.pop();
		        }
		    }
		    if(st.isEmpty())
		        System.out.println("True");
		    else
		        System.out.println("False");
		
		    
	}
    
}
