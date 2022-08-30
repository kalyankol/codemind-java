import java.util.Scanner;
class HelloWorld {
    static boolean prime(int n){
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isprime=false;
                }
            }
        }
        return isprime;
    }
    static boolean pal(int n){
        int a=n;
        int rem=0;
        int r;
        boolean ispal=false;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        if(a==rem){
            ispal=true;
        }
        return ispal;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(true){
            n=n+1;
            boolean isprime=prime(n);
            boolean ispal=pal(n);
            if(isprime && ispal){
                System.out.println(n);
                break;
            }
        }
    }
}