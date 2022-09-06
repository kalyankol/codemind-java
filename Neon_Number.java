import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=n*n;
		int s=0,r;
		while(sq>0){
		    r=sq%10;
		    s+=r;
		    sq=sq/10;
		}
		String str="Not Neon Number";
		if(s==n){
		    str="Neon Number";
		}
		System.out.print(str);
	}
}
