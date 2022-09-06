import java.util.Scanner;
class Main
{
    static boolean sdn(int n){
        boolean str=true;
        int r,a=n;
        if(n%10==0){
            str=false;
        }
        else{
            while(n>0){
            r=n%10;
            if(a%r!=0){
                str=false;
                break;
            }
            n=n/10;
          }
        }
        return str;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean p;
		for(int i=a;i<=b;i++){
		    p=sdn(i);
		    if(p){
		        System.out.printf("%d ",i);
		    }
		}
	}
}
