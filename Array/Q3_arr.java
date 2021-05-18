// Mr.john is doing a transport business. As he had a lot of customers for registering the car, he wants to give the preference for the
// person who comes rst, if the car is lled with n number after that who comes with EVEN is added and the rst element is removed
// , if ODD means do nothing.
// Input Format
// The rst line of input denotes seats N available in the car
// The next line of input contains total number of registered members M, followed by M space -separated integers
// Output Format
// Print the members in the car separated by a space
// If M<= 1 and N<=1 , Print -1.
// Sample Input Sample Output
// 2
// 5
// 10 23 44 56 43
//                                       44 56
// Sample Input              Sample Output
// 2
// 4
// 11 2 3 4
//                                     2 4


import java.util.*;
public class Q3_arr {
    public static void main(String[]args)
    {
        ArrayList<Integer> al =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int c=0;
        int a = sc.nextInt();
        int s = sc.nextInt();
        int arr[]= new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            if(arr[i]%2==0)
            al.add(arr[i]);
        }
        Collections.sort(al);

        for(int i=al.size()-1;i>=0;i--)
        {
            if(c<a)
            System.out.print(al.get(i)+" ");
            c++;
        }
    }
    
}
