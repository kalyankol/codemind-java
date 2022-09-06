import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		if(n<0){
		    n=-n;
		}
		if(n%10==0){
		    n=n/10;
		}
		int r,rem=0;
		while(n>0){
		    r=n%10;
		    rem=(rem*10)+r;
		    n=n/10;
		}
		if(a<0){
		    System.out.print(-rem);
		}
		else{
		    System.out.print(rem);
		}
	}
}
