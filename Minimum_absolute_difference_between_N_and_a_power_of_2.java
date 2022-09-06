import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double g=0;
		double l=0;
		for(int i=0;i<n;i++){
		    if(Math.pow(2,i)<=n){
		        g=Math.pow(2,i);
		    }
		}
		for(int i=0;i<n;i++){
		    if(Math.pow(2,i)>=n){
		        l=Math.pow(2,i);
		        break;
		    }
		}
		if((l-n)<(n-g)){
		    System.out.print((int)(l-n));
		}
		else{
		    System.out.print((int)(n-g));
		}
	}
}
