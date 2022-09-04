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
                    break;
                }
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        boolean prime;
        for(int i=0;i<n;i++){
            prime=prime(a[i]);
           if(prime){
               c+=1;
           } 
        }
        System.out.print(c);
    }
}