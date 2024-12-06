
/*4
121 456 675 890
10
not a Armstrong
405
not a Armstrong
684
not a Armstrong
1241
not a Armstrong*/
import java.util.*;
public class Armstrong{
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
                rev=rev+d*d*d;
                n/=10;
            }
            System.out.println(rev);
        
            if(temp==rev){
                System.out.println("Armstrong");
            }else{
                System.out.println("not a Armstrong");
            }
        }
    }
}