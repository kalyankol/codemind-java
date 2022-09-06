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
                }
            }
        }
        return isprime;
    }
    static int fp(int n){
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
        return f;
    }
    static int bp(int n){
        int b=0;
        boolean prime;
        while(true){
            n-=1;
            prime=prime(n);
            if(prime){
                b=n;
                break;
            }
        }
        return b;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean prime=prime(n);
		if(prime){
		    System.out.print("0");
		}
		else{
		    int f=fp(n);
		    int b=bp(n);
		    if((f-n)<(n-b)){
		        System.out.print(f-n);
		    }
		    else{
		        System.out.print(n-b);
		    }
		}
	}
}
