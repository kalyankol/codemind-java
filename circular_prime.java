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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,r,a=n;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        boolean p1=prime(a);
        boolean p2=prime(rem);
        if(p1 && p2){
            System.out.print("circular prime");
        }
        if(p1 && !p2){
            System.out.print("prime but not a circular prime");
        }
        if(!p1 && !p2){
            System.out.print("not prime");
        }
    }
}