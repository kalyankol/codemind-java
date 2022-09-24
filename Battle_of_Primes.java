import java.util.*;
class battle{
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
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=n1+n2;
        boolean p;
        while(true){
            n+=1;
            p=prime(n);
            if(p){
                System.out.print(n-(n1+n2));
                break;
            }
        }
    }
}