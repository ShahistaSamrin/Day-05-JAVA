import java.util.*;
public class Reverseno{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int rev=0;
            while(n>0)
            {
                int d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            System.out.println(rev);
        }
    }
}