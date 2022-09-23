import java.util.*;
class palin {
	public static boolean pal(int n) {
		int r,rem=0,a=n;
		while(n!=0) {
			r=n%10;
			rem=rem*10+r;
			n=n/10;
		}
		if(rem==a) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(pal(n)){
		    System.out.print("2");
		}
		else{
		    System.out.print("1");
		}
	}
}