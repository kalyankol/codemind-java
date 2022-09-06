import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,i=0;
		String s=String.valueOf(n);
	    int[] a=new int[s.length()];
	    while(n>0){
	        r=n%10;
	        a[i]=r;
	        i+=1;
	        n=n/10;
	    }
	    for(int j=s.length()-1;j>=0;j--){
	        if(a[j]==6){
	            a[j]=9;
	            break;
	        }
	    }
	    String str="";
	    for(int j=s.length()-1;j>=0;j--){
	        if(a[j]==9){
	            str+="9";
	        }
	        else{
	            str+="6";
	        }
	    }
	    System.out.print(str);
	}
}
