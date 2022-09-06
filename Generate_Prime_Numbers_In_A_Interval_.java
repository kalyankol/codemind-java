import java.util.Scanner;
import java.lang.Math;
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
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean prime;
		for(int i=x;i<=y;i++){
		    prime=prime(i);
		    if(prime){
		        System.out.printf("%d
",i);
		    }
		}
	}
}
