import java.util.*;
public class Q5 {

    static void dayHourTime(Stack<Integer> st)
    {
        int sec=0,min=0,hours=0;
        for(int i=0;i<st.size();i++)
        {
            int num=st.get(i);
             sec =num%60;
             hours = num/60;
             min = hours%60;
             hours/=60;
        }
        System.out.println(hours+":"+min+":"+sec);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            st.push(sc.nextInt());
        }
        dayHourTime(st);
    }
    
}
