import java.util.Scanner;
class Main
{
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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=a+b;
		int n1=n;
		int f=0;
		boolean prime;
		while(true){
		    n+=1;
		    prime=prime(n);
		    if(prime){
		        f=n;
		        break;
		    }
		}
		System.out.print(f-n1);
	}
}
