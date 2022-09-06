import java.util.Scanner;
class Main
{
    static int add(int n){
        int r,s=0;
        while(n>0){
            r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		while(true){
		    a=add(n);
		    if(a<=9){
		        System.out.print(a);
		        break;
		    }
		    n=a;
		}
	}
}
