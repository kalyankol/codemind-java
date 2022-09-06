import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int p=1;
		int r;
		while(n>0){
		    r=n%10;
		    s+=r;
		    p*=r;
		    n=n/10;
		}
		String str="Not Spy Number";
		if(p==s){
		    str="Spy Number";
		}
		System.out.print(str);
	}
}
