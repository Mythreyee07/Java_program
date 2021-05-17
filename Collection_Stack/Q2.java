import java.util.*;
public class Q2 {
  public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      Stack<Integer> st = new Stack<>();
      int a= sc.nextInt();
      int max=0;
      for(int i=0;i<a;i++)
      {
          int c = sc.nextInt();
          if(c==1)
          {
              int val = sc.nextInt();
              st.push(val);
              if(val>max)
              max=val;
          }
          if(c==2)
          {
              st.pop();
          }
          if(c==3)
          {
              System.out.print(max);
          }
      }

     
 }   
}
