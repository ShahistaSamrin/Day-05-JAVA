/*3 
23 212 191
32
not a palindrome
212
palindrome
191
palindrome*/
import java.util.*;
public class palindrome{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
                int d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            System.out.println(rev);
        
            if(temp==rev){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome");
            }
        }
    }
}