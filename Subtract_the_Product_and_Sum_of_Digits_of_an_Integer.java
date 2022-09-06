import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1,s=0,r;
		while(n>0){
		    r=n%10;
		    p*=r;
		    s+=r;
		    n=n/10;
		}
		System.out.print(p-s);
	}
}
