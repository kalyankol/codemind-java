import java.util.Scanner;
class Main
{
    static boolean pal(int n){
        int a=n;
        boolean ispal=false;
        int rem=0,r;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        if(a==rem){
           ispal=true; 
        }
        return ispal;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean pal;
		for(int i=a;i<=b;i++){
		    pal=pal(i);
		    if(pal){
		        System.out.printf("%d ",i);
		    }
		}
	}
}
