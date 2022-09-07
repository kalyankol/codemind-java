import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int fact=1,j=1;
		    while(true){
		        fact*=j;
		        j+=1;
		        if(j>a){
		            break;
		        }
		    }
		    System.out.println(fact);
		}
	}
}
