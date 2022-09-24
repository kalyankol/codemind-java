import java.util.*;
class primedivisor{
    public static boolean prime(int n){
        boolean p=true;
        if(n<=1){
            p=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    p=false;
                    break;
                }
            }
        }
        return p;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        boolean p;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                p=prime(i);
                if(!p){
                    c+=1;
                    //System.out.print(i);
                }
            }
        }
        System.out.print(c);
    }
}