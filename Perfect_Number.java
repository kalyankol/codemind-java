import java.util.*;
class perfect{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                f+=i;
            }
        }
        if(f==n){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}