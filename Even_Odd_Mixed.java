import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=0,o=0;
		int r;
		while(n>0){
		    r=n%10;
		    if(r%2==0){
		        e+=1;
		    }
		    else{
		        o+=1;
		    }
		    n=n/10;
		}
		if(e==0){
		    System.out.print("Odd");
		}
		if(o==0){
		    System.out.print("Even");
		}
		if(e!=0 && o!=0){
		    System.out.print("Mixed");
		}
	}
}
