import java.util.*;
public class Q1_allMap {
    public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        
    Map <Integer,String> s1 = new HashMap<>();
    Map <Integer,String> s2 = new LinkedHashMap<>();
    Map <Integer,String> s3 = new TreeMap<>();
    
    for(int i=0;i<a1;i++)
    {
        int a = sc.nextInt();
        String s4 = sc.next();
        s1.put(a,s4);
        s2.put(a,s4);
        s3.put(a,s4);
    }
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
}
}
