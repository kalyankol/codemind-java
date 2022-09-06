import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int m=sc.nextInt();
		double a=Math.pow(x,y);
		System.out.print((int)a%m);
	}
}
