import java.util.*;
class ugly{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q,c=0;
        q=n;
        while(q!=1)
        {
            if(q%2==0)
            {
                q=q/2;
            }
            else if(q%3==0)
            {
                q=q/3;
            }
            else if(q%5==0)
            {
                q=q/5;
            }
            else
            {
                c=c+1;
                break;
            }
        }
        if(c>0)
        {
            System.out.print("Not Ugly Number");
        }
        else
        {
            System.out.print("Ugly Number");
        }
    }
}