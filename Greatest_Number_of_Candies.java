import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int g=sc.nextInt();
		int max=a[0];
		for(int i=0;i<n;i++){
		    if(max<a[i]){
		        max=a[i];
		    }
		}
		String[] s=new String[n];
		for(int i=0;i<n;i++){
		    a[i]+=g;
		    if(a[i]>=max){
		        s[i]="True";
		    }
		    else{
		        s[i]="False";
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.printf("%s ",s[i]);
		}
	}
}
