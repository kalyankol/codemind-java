import java.util.*;
class almost{
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
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            String s="NO";
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    if(i*j==n && i!=j){
                        if(prime(i) && prime(j)){
                            s="YES";
                            break;
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}