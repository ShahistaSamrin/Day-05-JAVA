import java.util.*;
public class setbitcount{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int pos=0;
            int count=0;
            while(pos<=n)
            {
                if((n&(1<<pos))!=0){
                    count+=1;
                }
                pos++;
            }
            System.out.println("count="+count);
        }
    }
}