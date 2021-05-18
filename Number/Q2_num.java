// Consider the following series: 0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
// This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order and every even term is
// derived from the previous term using the formula (x/2).
// Write a program to nd the nth term in this series.
// The value n is a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to
// STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.
// For example, if n=10, the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term
// is (8/2)=4. Only the value 4 should be printed to STDOUT.
// You can assume that the 'n' will not exceed 20,000.
// Sample Input Sample Output
// 5                      4
import java.util.*;
public class Q2_num {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al =new ArrayList<>();
        int a = sc.nextInt()-1;
        
        al.add(0);
        al.add(0);
        for(int i=1;i<a;i++)
        {
            int b =2*i;
            int c =b/2;
            al.add(b);
            al.add(c);

        }
        System.out.println(al.get(a));
    }
    
}
